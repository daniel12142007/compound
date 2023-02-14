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

    }

    public void deleteAll() {

    }

    public void saveF(Company company) {
        try(Session ss = root.openSession()){
            ss.save(company);
        }
    }

    public void updateById(Long id, Company Company) {

    }

    public Company getById(Long id) {
        return null;
    }

    public List findAll() {
        return null;
    }
}

