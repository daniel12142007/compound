package org.example;

import org.example.repo.metods.StudentMETO;
import org.example.repo.metods.model.Student;

public class Studentservice {
    public static void main(String[] args) {
        StudentMETO studentRepository = new StudentMETO();
        Student student = new Student("daniel","ahatzanov",15);
//        studentRepository.save(student);//save table student
//        System.out.println(studentRepository.getID(1l));//get by id student
//        System.out.println(studentRepository.findAll());//find all student
//        studentRepository.deleteID(1l);//delete by id student
//        studentRepository.deleteAll();//delete all student
    }
}
