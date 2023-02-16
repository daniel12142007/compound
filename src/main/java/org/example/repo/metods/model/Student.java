package org.example.repo.metods.model;

import javax.persistence.*;
import java.util.Objects;


@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String student_name;
    private String surName;
    private int age;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private Course course;

    public Student(String student_name, String surName, int age) {
        this.student_name = student_name;
        this.surName = surName;
        this.age = age;
    }

    public Student() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
               "id=" + id +
               ", student_name='" + student_name + '\'' +
               '}';
    }
}

