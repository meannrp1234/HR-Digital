package com.example.hrd.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
public class Employee {
    public enum Position{STAFF,HEAD}
    @Id private Integer id;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDateTime dateBorn;
    private String address;
    private String tel;
    @Enumerated(EnumType.STRING)
    private Position position;
    private LocalDateTime startWork;
    private String username;
    private String password;

    @JsonManagedReference
    @ManyToOne
    private Department department;

    @OneToMany(mappedBy = "employees")
    private List<Leave> leaves;

    @OneToMany(mappedBy = "employees")
    private List<TimeWork> timeWorks;

    @ManyToMany
    private Set<Authority> authorities;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getDateBorn() {
        return dateBorn;
    }
    public void setDateBorn(LocalDateTime dateBorn) {
        this.dateBorn = dateBorn;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDateTime getStartWork() {
        return startWork;
    }
    public void setStartWork(LocalDateTime startWork) {
        this.startWork = startWork;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Leave> getLeaves() {
        return leaves;
    }
    public void setLeaves(List<Leave> leaves) {
        this.leaves = leaves;
    }

    public List<TimeWork> getTimeWorks() {
        return timeWorks;
    }
    public void setTimeWorks(List<TimeWork> timeWorks) {
        this.timeWorks = timeWorks;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employees = (Employee) o;
        return id.equals(employees.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}