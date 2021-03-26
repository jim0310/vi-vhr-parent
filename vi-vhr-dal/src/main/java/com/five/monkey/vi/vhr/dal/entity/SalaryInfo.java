package com.five.monkey.vi.vhr.dal.entity;

import java.math.BigDecimal;

public class SalaryInfo {
    private Long id;

    private Long employeeId;

    private BigDecimal bonus;

    private BigDecimal lunchSalary;

    private BigDecimal trafficSalary;

    private BigDecimal basicSalary;

    private BigDecimal allSalary;

    private Integer deliverYear;

    private Integer deliverMonth;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getLunchSalary() {
        return lunchSalary;
    }

    public void setLunchSalary(BigDecimal lunchSalary) {
        this.lunchSalary = lunchSalary;
    }

    public BigDecimal getTrafficSalary() {
        return trafficSalary;
    }

    public void setTrafficSalary(BigDecimal trafficSalary) {
        this.trafficSalary = trafficSalary;
    }

    public BigDecimal getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(BigDecimal basicSalary) {
        this.basicSalary = basicSalary;
    }

    public BigDecimal getAllSalary() {
        return allSalary;
    }

    public void setAllSalary(BigDecimal allSalary) {
        this.allSalary = allSalary;
    }

    public Integer getDeliverYear() {
        return deliverYear;
    }

    public void setDeliverYear(Integer deliverYear) {
        this.deliverYear = deliverYear;
    }

    public Integer getDeliverMonth() {
        return deliverMonth;
    }

    public void setDeliverMonth(Integer deliverMonth) {
        this.deliverMonth = deliverMonth;
    }
}