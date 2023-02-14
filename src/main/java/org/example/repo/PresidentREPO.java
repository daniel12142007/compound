package org.example.repo;

import org.example.repo.metods.model.Prezident;

import java.util.List;

public interface PresidentREPO {
    void deleteById(Long id);
    void deleteAll();
    void saveF(Prezident prezident);
    void updateById(Long id, Prezident phone);
    Prezident getById(Long id);
    List findAll();

}

