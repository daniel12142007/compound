package org.example.repo.metods;

import org.example.configuration.Util;
import org.example.model.Prezident;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class PresidentMETO {
    private SessionFactory sessionFactory = Util.getConnection();

    public void deleteById(Long id) {

    }

    public void deleteAll() {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
//    session.createQuery("delete from"); Student
//    session.createQuery("delete from "); Course
            session.createQuery("delete from Company c");
            session.createQuery("delete from Prezident p");
            System.out.println("delete all");
            session.getTransaction().commit();

        }
    }

    public void saveF(Prezident prezident) {
        try (Session session = sessionFactory.openSession()) {
            session.save(prezident);
            System.out.println("Save!");
        }
    }

    public Prezident getById(Long id) {
        try (Session session = sessionFactory.getCurrentSession()) {
            return session.get(Prezident.class, id);
        }
    }



    public List findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select p from Prezident p").getResultList();
        }
    }

}

