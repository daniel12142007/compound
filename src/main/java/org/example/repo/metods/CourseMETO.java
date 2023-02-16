package org.example.repo.metods;

import org.example.configuration.Util;
import org.example.repo.metods.model.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;


public class CourseMETO {
    private final SessionFactory sessionFactory = Util.getConnection();

    public void save(Course course) {
        try (Session session = sessionFactory.openSession()) {
            session.save(course);
        }
    }

    public List findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select cour from Course cour").getResultList();
        }
    }

    public Course getID(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Course.class, id);
        }
    }

    public void deleteAll() {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.createQuery("delete from Student sa").executeUpdate();
            session.createQuery("delete from Course cour").executeUpdate();
            session.getTransaction().commit();
        }
    }

    public void deleteID(Long idsa) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.createQuery("delete from Student sa").executeUpdate();
            session.createQuery("delete from Course cour").executeUpdate();
            session.getTransaction().commit();
        }
    }
}

