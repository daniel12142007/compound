package org.example.repo.metods;

import org.example.configuration.Util;
import org.example.repo.metods.model.Course;
import org.example.repo.CourseREPO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class CourseMETO implements CourseREPO {
    public static final SessionFactory root = Util.getConnection();


    public void deleteById(Long id) {

    }

    public void deleteAll() {

    }

    public void saveF(Course course) {
        try(Session ss = root.openSession()){
            ss.save(course);
        }
    }

    public void updateById(Long id, Course course) {

    }

    public Course getById(Long id) {
        return null;
    }

    public List findAll() {
        return null;
    }
}

