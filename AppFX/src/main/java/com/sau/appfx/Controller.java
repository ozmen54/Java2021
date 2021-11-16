package com.sau.appfx;

import com.sau.appdb.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        Main adb = new Main();


        welcomeText.setText("Gelen:" + adb.getir(2).getName());
    }
}