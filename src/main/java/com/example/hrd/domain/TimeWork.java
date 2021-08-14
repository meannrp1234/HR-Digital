package com.example.hrd.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.Objects;


@Entity
public class TimeWork {
    @Id
    private Integer id;
    private LocalDateTime workDate;
    private LocalDateTime timeOut;

    @ManyToOne
    private Employee employees;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getWorkDate() {
        return workDate;
    }

    public void setWorkDate(LocalDateTime workDate) {
        this.workDate = workDate;
    }

    public LocalDateTime getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(LocalDateTime timeOut) {
        this.timeOut = timeOut;
    }

    public Employee getEmployee() {
        return employees;
    }

    public void setEmployee(Employee employee) {
        this.employees = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeWork timeWork = (TimeWork) o;
        return id.equals(timeWork.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}