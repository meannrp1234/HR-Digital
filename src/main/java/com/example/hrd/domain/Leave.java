package com.example.hrd.domain;

import javax.persistence.*;
import java.io.File;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Leave {
    public enum LeaveType {SICK,PERSONAL,VACATION,MATERNITY,MILITARY,ORDINATION,TRAINING}
    public enum StatusLeave {APPROVE,DISAPPROVE}
    @Id
    private Integer id;
    private String reasonLeave;
    private LocalDateTime dateLeave;
    private LocalDateTime startDate;
    private LocalDateTime startTime;
    private LocalDateTime endDate;
    private LocalDateTime endTime;
    private float totalDateLeave;
    private File fileLeave;
    private String nameApprove;
    private LocalDateTime dateApprove;

    @Enumerated(EnumType.STRING)
    private LeaveType leaveType;
    @Enumerated(EnumType.STRING)
    private StatusLeave statusLeave;

    //employee_id
    @ManyToOne
    private Employee employees;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReasonLeave() {
        return reasonLeave;
    }

    public void setReasonLeave(String reasonLeave) {
        this.reasonLeave = reasonLeave;
    }

    public LocalDateTime getDateLeave() {
        return dateLeave;
    }

    public void setDateLeave(LocalDateTime dateLeave) {
        this.dateLeave = dateLeave;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public float getTotalDateLeave() {
        return totalDateLeave;
    }

    public void setTotalDateLeave(float totalDateLeave) {
        this.totalDateLeave = totalDateLeave;
    }

    public File getFileLeave() {
        return fileLeave;
    }

    public void setFileLeave(File fileLeave) {
        this.fileLeave = fileLeave;
    }

    public String getNameApprove() {
        return nameApprove;
    }

    public void setNameApprove(String nameApprove) {
        this.nameApprove = nameApprove;
    }

    public LocalDateTime getDateApprove() {
        return dateApprove;
    }

    public void setDateApprove(LocalDateTime dateApprove) {
        this.dateApprove = dateApprove;
    }

    public LeaveType getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(LeaveType leaveType) {
        this.leaveType = leaveType;
    }

    public StatusLeave getStatusLeave() {
        return statusLeave;
    }

    public void setStatusLeave(StatusLeave statusLeave) {
        this.statusLeave = statusLeave;
    }

    public Employee getEmployee() {
        return employees;
    }

    public void setEmployee(Employee employees) {
        this.employees = employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leave leave = (Leave) o;
        return id.equals(leave.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
