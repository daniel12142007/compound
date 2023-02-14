package org.example.repo;

import org.example.model.Prezident;

import java.util.List;

public interface PresidentREPO {
    void deleteById(Long id);
    void deleteAll();
    void saveF(Prezident prezident);
    Prezident getById(Long id);
    List findAll();

}

