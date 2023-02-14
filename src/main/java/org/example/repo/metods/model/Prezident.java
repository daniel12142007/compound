package org.example.repo.metods.model;

import javax.persistence.*;

@Entity
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
                ", company=" + company +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Prezident prezident = (Prezident) o;

        if (id != null ? !id.equals(prezident.id) : prezident.id != null) return false;
        if (name != null ? !name.equals(prezident.name) : prezident.name != null) return false;
        return company != null ? company.equals(prezident.company) : prezident.company == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        return result;
    }
}
