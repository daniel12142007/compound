package org.example.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prezident_id")
    private Prezident prezident;

    public Company(String name) {
        this.name = name;
    }

    public Company() {

    }
}
