package org.example.repo.metods;

import org.example.configuration.Util;
import org.example.repo.metods.model.Course;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;


public class CourseMETO {
    public static final SessionFactory root = Util.getConnection();


    public void deleteById(Long id) {
        try (Session session = root.openSession()) {
            session.beginTransaction();
            Course company = getById(id);
            session.delete(company);
            session.getTransaction().commit();
        }
    }

    public void deleteAll() {
        try (Session session = root.openSession()) {
            session.beginTransaction();
            session.createQuery("delete from Student st").executeUpdate();
            session.createQuery("delete from Course sa").executeUpdate();
            session.createQuery("delete from Company c").executeUpdate();
            session.getTransaction().commit();
        }
    }

    public void saveF(Course course) {
        try(Session ss = root.openSession()){
            ss.save(course);
        }
    }

    public void updateById(Long id, Course coursey) {
        try (Session ss = root.openSession()) {
            ss.beginTransaction();
            Course getById = getById(id);
            getById.setCourse_name(coursey.getCourse_name());
            ss.saveOrUpdate(getById);
            ss.getTransaction().commit();
        }
    }

    public Course getById(Long id) {
        try (Session session = root.openSession()) {
            return session.get(Course.class, id);
        }
    }
    public List findAll() {
        try (Session ss = root.openSession()) {
            return ss.createQuery("select company from Company company").getResultList();
        }
    }
}

