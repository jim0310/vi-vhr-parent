package com.five.monkey.vi.vhr.dal.entity;

import java.util.Date;

public class TrainInfo {
    private Long id;

    private Long employeeId;

    private Date trainDate;

    private String trainContent;

    private String trainAddress;

    private Byte trainState;

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

    public Date getTrainDate() {
        return trainDate;
    }

    public void setTrainDate(Date trainDate) {
        this.trainDate = trainDate;
    }

    public String getTrainContent() {
        return trainContent;
    }

    public void setTrainContent(String trainContent) {
        this.trainContent = trainContent == null ? null : trainContent.trim();
    }

    public String getTrainAddress() {
        return trainAddress;
    }

    public void setTrainAddress(String trainAddress) {
        this.trainAddress = trainAddress == null ? null : trainAddress.trim();
    }

    public Byte getTrainState() {
        return trainState;
    }

    public void setTrainState(Byte trainState) {
        this.trainState = trainState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}