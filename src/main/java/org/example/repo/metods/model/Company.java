package org.example.repo.metods.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company_name;
    private String logotip;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prezident_id")
    private Prezident prezident;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<Course> courses;


    public Company(String company_name, String logotip) {
        this.company_name = company_name;
        this.logotip = logotip;
    }

    public Company() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Prezident getPrezident() {
        return prezident;
    }

    public void setPrezident(Prezident prezident) {
        this.prezident = prezident;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", company_name='" + company_name + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Company company = (Company) o;
//
//        if (id != null ? !id.equals(company.id) : company.id != null) return false;
//        if (company_name != null ? !company_name.equals(company.company_name) : company.company_name != null)
//            return false;
//        if (prezident != null ? !prezident.equals(company.prezident) : company.prezident != null) return false;
//        return courses != null ? courses.equals(company.courses) : company.courses == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id != null ? id.hashCode() : 0;
//        result = 31 * result + (company_name != null ? company_name.hashCode() : 0);
//        result = 31 * result + (prezident != null ? prezident.hashCode() : 0);
//        result = 31 * result + (courses != null ? courses.hashCode() : 0);
//        return result;
//    }
}

