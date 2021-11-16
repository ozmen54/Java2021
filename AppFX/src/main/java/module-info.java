module com.sau.appfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires AppDB;


    opens com.sau.appfx to javafx.fxml;
    exports com.sau.appfx;
}