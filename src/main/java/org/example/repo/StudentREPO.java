package org.example.repo;

import org.example.model.Course;
import org.example.model.Prezident;
import org.example.model.Student;

import java.util.List;

public interface StudentREPO {
    void deleteById(Long id);
    void deleteAll();
    void saveF(Student phone);
    Student getById(Long id);
    List findAll();
}
