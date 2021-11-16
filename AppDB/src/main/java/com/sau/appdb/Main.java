package com.sau.appdb;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    public static void main(String[] args) {


    }

    public Student getir(int id){
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Student st = em.find(Student.class, id);
        System.out.println("Öğrenci: " + st.getName());
        em.getTransaction().commit();
        return st;
    }
}
