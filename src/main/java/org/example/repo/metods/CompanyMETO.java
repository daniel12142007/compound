package org.example.repo.metods;

import org.example.configuration.Util;
import org.example.repo.metods.model.Company;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class CompanyMETO{
    private SessionFactory sessionFactory = Util.getConnection();

    public void save(Company company) {
        try (Session session = sessionFactory.openSession()) {
            session.save(company);
        }
    }

    public List findAll() {
        try (Session session = sessionFactory.openSession()){
            return session.createQuery("select c from Company  c").getResultList();
        }
    }

    public Company getID(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Company.class, id);
        }
    }

    public void deleteAll() {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.createQuery("delete from Student st").executeUpdate();
            session.createQuery("delete from Course sa").executeUpdate();
            session.createQuery("delete from Company c").executeUpdate();
            session.getTransaction().commit();
        }
    }

    public void deleteID(Long id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Company company = getID(id);
            session.delete(company);
            session.getTransaction().commit();
        }
    }
}

