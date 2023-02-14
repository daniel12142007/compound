package org.example.repo;

import org.example.model.Company;

import java.util.List;

public interface CompanyREPO {
    void deleteById(Long id);
    void deleteAll();
    void saveF(Company company);
    void updateById(Long id, Company Company);
    Company getById(Long id);
    Company findById(String name);
    List findAll();
}
