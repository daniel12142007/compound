package org.example.repo;

import org.example.model.Prezident;

import java.util.List;

public interface StudentREPO {
    void deleteById(Long id);
    void deleteAll();
    void saveF(Prezident phone);
    void updateById(Long id, Prezident phone);
    Prezident getById(Long id);
    Prezident findById(String name);
    List findAll();
}