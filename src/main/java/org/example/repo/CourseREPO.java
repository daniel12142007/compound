package org.example.repo;

import org.example.model.Course;

import java.util.List;

public interface CourseREPO {
    void deleteById(Long id);
    void deleteAll();
    void saveF(Course course);
    void updateById(Long id, Course course);
    Course getById(Long id);
    Course findById(String name);
    List findAll();
}
