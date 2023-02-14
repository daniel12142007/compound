package org.example.repo;

import org.example.repo.metods.model.Course;

import java.util.List;

public interface CourseREPO {
    void deleteById(Long id);
    void deleteAll();
    void saveF(Course course);
    void updateById(Long id, Course course);
    Course getById(Long id);
    List findAll();
}
