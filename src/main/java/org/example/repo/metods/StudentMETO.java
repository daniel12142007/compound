package org.example.repo.metods;

import org.example.configuration.Util;
import org.example.repo.metods.model.Prezident;
import org.example.repo.StudentREPO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentMETO implements StudentREPO {
    public static final SessionFactory root = Util.getConnection();


    public void deleteById(Long id) {

    }

    public void deleteAll() {

    }

    public void saveF(Prezident president) {
        try(Session ss = root.openSession()){
            ss.save(president);
        }
    }

    public void updateById(Long id, Prezident president) {

    }

    public Prezident getById(Long id) {
        return null;
    }

    public List findAll() {
        return null;
    }
}

