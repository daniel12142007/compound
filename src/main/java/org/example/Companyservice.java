package org.example;

import org.example.repo.metods.CompanyMETO;
import org.example.repo.metods.model.Company;
import org.example.repo.metods.model.Course;
import org.example.repo.metods.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Companyservice {
    public static void main(String[] args) {
        CompanyMETO companyRepository = new CompanyMETO();
        List<Student> studentList = new ArrayList<>();
        List<Course> courseList = new ArrayList<>();
        Company company = new Company("IT", "java");
        Course course = new Course("it.kg", 8000);

        course.setCompany(company);
        courseList.add(course);
        company.setCourses(courseList);
        Student student = new Student("Daniel", "Ahatjanov", 15);
        student.setCourse(course);
        studentList.add(student);
        course.setStudents(studentList);

//       companyRepository.save(company);//save table course
//        System.out.println(companyRepository.getID(1l));//get by id course
//        System.out.println(companyRepository.findAll());//find all course
//      companyRepository.deleteID(1l);//delete by id course
//       companyRepository.deleteAll();//delete all course
    }
}