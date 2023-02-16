package org.example.repo.metods.model;

import javax.persistence.*;

@Entity
public class Prezident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private long money;
    @OneToOne(mappedBy = "prezident",cascade = CascadeType.ALL)
    private Company company;

    public Prezident(String name, long money) {
        this.name = name;
        this.money = money;
    }

    public Prezident() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Prezident{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
