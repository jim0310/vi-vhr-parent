package com.five.monkey.vi.vhr.dal.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OccurDetail {
    private Long id;

    private Long employeeId;

    private Date occurDate;

    private String cause;

    private BigDecimal occurQuota;

    private Byte occurType;

    private String remark;

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

    public Date getOccurDate() {
        return occurDate;
    }

    public void setOccurDate(Date occurDate) {
        this.occurDate = occurDate;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public BigDecimal getOccurQuota() {
        return occurQuota;
    }

    public void setOccurQuota(BigDecimal occurQuota) {
        this.occurQuota = occurQuota;
    }

    public Byte getOccurType() {
        return occurType;
    }

    public void setOccurType(Byte occurType) {
        this.occurType = occurType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}