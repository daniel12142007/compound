package org.example.repo;

import org.example.repo.metods.model.Company;


public interface CompanyREPO {
    void deleteById(Long id);
    void deleteAll();
    void saveF(Company company);
    void updateById(Long id, Company Company);
    Company getById(Long id);
}
