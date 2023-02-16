package org.example;

import org.example.repo.metods.PresidentMETO;
import org.example.repo.metods.model.Company;
import org.example.repo.metods.model.Course;
import org.example.repo.metods.model.Prezident;
import org.example.repo.metods.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Prezidentservice {
    public static void main(String[] args) {
        PresidentMETO prezidentRepository = new PresidentMETO();
        List<Student> studentList = new ArrayList<>();
        List<Course> courseList = new ArrayList<>();
        Prezident prezident = new Prezident("Talant",1);
        Company company = new Company("Company","asus");
        company.setPrezident(prezident);
        prezident.setCompany(company);
        Course course = new Course("it.kg",8000);
        course.setCompany(company);
        courseList.add(course);
        company.setCourses(courseList);
        Student student = new Student("Student","studentovich",15);
        student.setCourse(course);
        studentList.add(student);
        course.setStudents(studentList);



//        prezidentRepository.save(prezident); // save president
//        System.out.println(prezidentRepository.getID(1l));// get by id prezident
//        System.out.println(prezidentRepository.findAll());// find all prezident
//        prezidentRepository.deleteID(2l);// delete by id prezident
//        prezidentRepository.deleteAll();// delete all prezident
    }
}
