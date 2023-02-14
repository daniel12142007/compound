package org.example.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Prezident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "prezident",cascade = CascadeType.ALL)
    private Company company;

    public Prezident(String name) {
        this.name = name;
    }

    public Prezident() {

    }
}
