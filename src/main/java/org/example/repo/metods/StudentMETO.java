package org.example.repo.metods;

import org.example.configuration.Util;
import org.example.repo.metods.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class StudentMETO{
    public static final SessionFactory root = Util.getConnection();


    public void deleteById(Long id) {
        try (Session session = root.openSession()) {
            session.beginTransaction();
            Student company = getById(id);
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

    public void saveF(Student student) {
        try(Session ss = root.openSession()){
            ss.save(student);
        }
    }

    public void updateById(Long id, Student company) {
        try (Session ss = root.openSession()) {
            ss.beginTransaction();
            Student getById = getById(id);
            getById.setStudent_name(company.getStudent_name());
            ss.saveOrUpdate(getById);
            ss.getTransaction().commit();
        }
    }

    public Student getById(Long id) {
        try (Session session = root.openSession()) {
            return session.get(Student.class, id);
        }
    }
}

