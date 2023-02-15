package org.example.repo.metods;

import org.example.configuration.Util;
import org.example.repo.metods.model.Prezident;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class PresidentMETO {
    public static final SessionFactory root = Util.getConnection();


    public void deleteById(Long id) {
        try (Session session = root.openSession()) {
            session.beginTransaction();
            Prezident prezident = getById(id);
            session.delete(prezident);
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

    public void saveF(Prezident prezidenty) {
        try(Session ss = root.openSession()){
            ss.save(prezidenty);
        }
    }

    public void updateById(Long id, Prezident prezident) {
        try (Session ss = root.openSession()) {
            ss.beginTransaction();
            Prezident getById = getById(id);
            getById.setName(prezident.getName());
            ss.saveOrUpdate(getById);
            ss.getTransaction().commit();
        }
    }

    public Prezident getById(Long id) {
        try (Session session = root.openSession()) {
            return session.get(Prezident.class, id);
        }
    }
    public List findAll() {
        try (Session ss = root.openSession()) {
            return ss.createQuery("select company from Prezident company").getResultList();
        }
    }
}

