package org.example.repo.metods;

import org.example.configuration.Util;
import org.example.repo.metods.model.Prezident;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class PresidentMETO {
    private static final SessionFactory sessionFactory = Util.getConnection();

    public void save(Prezident prezident) {
        try (Session session = sessionFactory.openSession()) {
            session.save(prezident);
            System.out.println("save");
        }
    }
    public List findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select p from Prezident p").getResultList();
        }
    }

    public Prezident getID(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Prezident.class, id);
        }
    }

    public void deleteAll() {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.createQuery("delete from Student stud").executeUpdate();
            session.createQuery("delete from Course cour").executeUpdate();
            session.createQuery("delete from Company com").executeUpdate();
            session.createQuery("delete from Prezident p").executeUpdate();
            System.out.println("delete");
            session.getTransaction().commit();
        }
    }

    public void deleteID(Long ids) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Prezident prezident = getID(ids);
            session.delete(prezident);
            session.getTransaction().commit();
        }
    }
}

