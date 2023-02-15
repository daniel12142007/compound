package org.example.repo.metods;

import org.example.configuration.Util;
import org.example.repo.metods.model.Company;
import org.example.repo.CompanyREPO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class CompanyMETO implements CompanyREPO {
    public static final SessionFactory root = Util.getConnection();

    public void deleteById(Long id) {
        try (Session session = root.openSession()) {
            session.beginTransaction();
            Company company = getById(id);
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

    public void saveF(Company company) {
        try(Session ss = root.openSession()){
            ss.save(company);
        }
    }

    public void updateById(Long id, Company company) {
        try (Session ss = root.openSession()) {
            ss.beginTransaction();
            Company getById = getById(id);
            getById.setCompany_name(company.getCompany_name());
            ss.saveOrUpdate(getById);
            ss.getTransaction().commit();
        }
    }

    public Company getById(Long id) {
        try (Session session = root.openSession()) {
            return session.get(Company.class, id);
        }
    }
    public List findAll() {
        try (Session ss = root.openSession()) {
            return ss.createQuery("select company from Company company").getResultList();
        }
    }
}

