package org.example;

import org.example.repo.metods.CourseMETO;
import org.example.repo.metods.model.Course;
import org.example.repo.metods.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Courseservice {
    public static void main(String[] args) {
        CourseMETO courseRepository = new CourseMETO();
        List<Student> list = new ArrayList<>();
        Student student = new Student("Daniel","Ahatzanov",15);
        Course course = new Course("it.kg",8000);
        student.setCourse(course);
        list.add(student);
        course.setStudents(list);

//        courseRepository.save(course);//save table course
//        System.out.println(courseRepository.getID(1l));//get by id course
//        System.out.println(courseRepository.findAll());//find all course
//        courseRepository.deleteID(1l);//delete by id course
//        courseRepository.deleteAll();//delete all course
    }
}
