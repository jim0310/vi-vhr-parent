package com.five.monkey.vi.vhr.dal.entity;

import java.util.Date;

public class RemoveInfo {
    private Long id;

    private Long employeeId;

    private Long preDepartmentId;

    private Long nextDepartmentId;

    private Date removeDate;

    private String removeCause;

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

    public Long getPreDepartmentId() {
        return preDepartmentId;
    }

    public void setPreDepartmentId(Long preDepartmentId) {
        this.preDepartmentId = preDepartmentId;
    }

    public Long getNextDepartmentId() {
        return nextDepartmentId;
    }

    public void setNextDepartmentId(Long nextDepartmentId) {
        this.nextDepartmentId = nextDepartmentId;
    }

    public Date getRemoveDate() {
        return removeDate;
    }

    public void setRemoveDate(Date removeDate) {
        this.removeDate = removeDate;
    }

    public String getRemoveCause() {
        return removeCause;
    }

    public void setRemoveCause(String removeCause) {
        this.removeCause = removeCause == null ? null : removeCause.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}