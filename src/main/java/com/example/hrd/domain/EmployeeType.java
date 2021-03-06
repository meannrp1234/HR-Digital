package com.example.hrd.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;

@Entity
public class EmployeeType {
    @Id private Integer id;
    private String name;

    @OneToMany
    @JoinColumn(name = "EMPLOYEES_TYPE_ID")
    private List<LeaveMaxSetting> leaveMaxRules;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setNameEmpType(String name) {
        this.name = name;
    }

    public List<LeaveMaxSetting> getLeaveMaxRules() {
        return leaveMaxRules;
    }
    public void setLeaveMaxRules(List<LeaveMaxSetting> leaveMaxRules) {
        this.leaveMaxRules = leaveMaxRules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeType that = (EmployeeType) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}