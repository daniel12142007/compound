package org.example.repo.metods;

import org.example.configuration.Util;
import org.example.model.Course;
import org.example.model.Prezident;
import org.example.model.Student;
import org.example.repo.StudentREPO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentMETO implements StudentREPO {

    private SessionFactory sessionFactory = Util.getConnection();

    @Override
    public void deleteById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Student student = getById(id);
            session.delete(student);
            session.getTransaction().commit();
        }
    }


    @Override
    public void deleteAll() {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.createQuery("delete from Student s");
            session.createQuery("delete from Course c").executeUpdate();
            session.getTransaction().commit();
        }
    }

    @Override
    public void saveF(Student phone) {
        try (Session session = sessionFactory.openSession()) {
            session.save(phone);
        }
    }

    @Override
    public Student getById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Student.class, id);
        }
    }

    @Override
    public List findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select s from Student s").getResultList();
        }
    }
}


