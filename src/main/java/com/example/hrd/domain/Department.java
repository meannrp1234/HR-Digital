package com.example.hrd.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

//DEPARTMENT
// ID,NAME,COMPANY_ID
@Entity
public class Department {
    //ID
    @Id
    private Integer id;
    //NAME
    @Column(name = "NAME")
    private String name;

    //COMPANY_ID
    @JoinColumn(name = "COMPANY_ID")
    @ManyToOne
    private Company company;

    @OneToOne(mappedBy = "department")
    private Leader leader;

    @JsonBackReference
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}