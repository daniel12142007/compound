package org.example.repo.metods.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Password_Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int id_pass;
    private String country;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

    @Override
    public String toString() {
        return "Password_Student{" +
               "id->" + id +
               ", id_pass->" + id_pass +
               ", country->'" + country + '\'' +
               '}';
    }
}
