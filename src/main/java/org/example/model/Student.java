package org.example.model;

import javax.persistence.*;
import java.util.List;

@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne( cascade = CascadeType.ALL)
    @JoinColumn(name="course id")
    private Student student;
    public Student() {

    }

    public Student(Student student) {
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", student=" + student +
                '}';
    }
}

