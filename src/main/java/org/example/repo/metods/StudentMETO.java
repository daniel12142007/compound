package org.example.repo.metods;

import org.example.configuration.Util;
import org.example.repo.metods.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentMETO{
    private final SessionFactory sessionFactory = Util.getConnection();

    public void save(Student student) {
        try (Session session = sessionFactory.openSession()) {
            session.save(student);
        }
    }

    public List findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select s from Student s").getResultList();
        }
    }

    public Student getID(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Student.class, id);
        }
    }

    public void deleteAll() {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.createQuery("delete from Student s").executeUpdate();
            session.getTransaction().commit();
        }
    }

    public void deleteID(Long idsa) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.createQuery("delete from Student s where id="+idsa).executeUpdate();
            session.getTransaction().commit();
        }
    }
    public void denmid(Long id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.createQuery("delete from Student s where Course.id="+id).executeUpdate();
            session.getTransaction().commit();
        }
    }
}

