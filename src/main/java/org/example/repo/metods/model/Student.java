package org.example.repo.metods.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Data
@NoArgsConstructor
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

    @OneToOne(mappedBy = "studend_id", cascade = CascadeType.ALL)
    private Password_Student passwordStudent;

    public Student(String student_name, String surName, int age) {
        this.student_name = student_name;
        this.surName = surName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
               "id=" + id +
               ", student_name='" + student_name + '\'' +
               '}';
    }
}

