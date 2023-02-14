package org.example.repo.metods;

import org.example.configuration.Util;
import org.example.model.Course;
import org.example.repo.CourseREPO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class CourseMETO implements CourseREPO {
    private SessionFactory sessionFactory = Util.getConnection();

    @Override
    public void deleteById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Course course = getById(id);
            session.delete(course);
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
    public void saveF(Course course) {
        try (Session session = sessionFactory.openSession()) {
            session.save(course);
        }

    }


    @Override
    public Course getById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Course.class, id);
        }
    }


    @Override
    public List findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("select c from Course c").getResultList();
        }
    }
}

