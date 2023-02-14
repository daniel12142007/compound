package org.example.repo.metods;

import org.example.configuration.Util;
import org.example.repo.metods.model.Prezident;
import org.example.repo.PresidentREPO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class PresidentMETO implements PresidentREPO {
    public static final SessionFactory root = Util.getConnection();


    public void deleteById(Long id) {

    }

    public void deleteAll() {

    }

    public void saveF(Prezident prezident) {
        try(Session ss = root.openSession()){
            ss.save(prezident);
        }
    }

    public void updateById(Long id, Prezident phone) {

    }

    public Prezident getById(Long id) {
        return null;
    }

    public List findAll() {
        return null;
    }
}

