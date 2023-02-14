package org.example.repo;

import org.example.model.Company;

import java.util.List;

public interface CompanyREPO {
    void deleteById(Long id);
    void deleteAll();
    void saveF(Company company);
    Company getById(Long id);
    List findAll();
}
