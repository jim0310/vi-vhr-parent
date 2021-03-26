package com.five.monkey.vi.vhr.dal.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {
    private Long id;

    private Long userId;

    private Long departmentId;

    private String job;

    private Byte duty;

    private BigDecimal basisSalary;

    private Byte engageForm;

    private Date beginWorkDate;

    private Byte workState;

    private Date beFormDate;

    private Date beginContract;

    private Date endContract;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public Byte getDuty() {
        return duty;
    }

    public void setDuty(Byte duty) {
        this.duty = duty;
    }

    public BigDecimal getBasisSalary() {
        return basisSalary;
    }

    public void setBasisSalary(BigDecimal basisSalary) {
        this.basisSalary = basisSalary;
    }

    public Byte getEngageForm() {
        return engageForm;
    }

    public void setEngageForm(Byte engageForm) {
        this.engageForm = engageForm;
    }

    public Date getBeginWorkDate() {
        return beginWorkDate;
    }

    public void setBeginWorkDate(Date beginWorkDate) {
        this.beginWorkDate = beginWorkDate;
    }

    public Byte getWorkState() {
        return workState;
    }

    public void setWorkState(Byte workState) {
        this.workState = workState;
    }

    public Date getBeFormDate() {
        return beFormDate;
    }

    public void setBeFormDate(Date beFormDate) {
        this.beFormDate = beFormDate;
    }

    public Date getBeginContract() {
        return beginContract;
    }

    public void setBeginContract(Date beginContract) {
        this.beginContract = beginContract;
    }

    public Date getEndContract() {
        return endContract;
    }

    public void setEndContract(Date endContract) {
        this.endContract = endContract;
    }
}