package org.example.repo;

import org.example.repo.metods.model.Student;

public interface StudentREPO {
    void deleteById(Long id);
    void deleteAll();
    void saveF(Student student);
    void updateById(Long id, Student student);
    Student getById(Long id);
}
