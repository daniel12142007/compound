package org.example.repo;

import org.example.repo.metods.model.Prezident;

import java.util.List;

public interface StudentREPO {
    void deleteById(Long id);
    void deleteAll();
    void saveF(Prezident president);
    void updateById(Long id, Prezident president);
    Prezident getById(Long id);
    List findAll();
}
