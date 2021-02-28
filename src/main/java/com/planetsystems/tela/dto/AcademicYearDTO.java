package com.planetsystems.tela.dto;

import java.util.Date;

public class AcademicYearDTO extends ParentDTO{
    private String code;
    private String name;
    private String activationStatus;
    private String startDate;
    private String endDate;




    public AcademicYearDTO() {
    }

    public AcademicYearDTO(String id) {
        super(id);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivationStatus() {
        return activationStatus;
    }

    public void setActivationStatus(String activationStatus) {
        this.activationStatus = activationStatus;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "AcademicYearDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", activationStatus='" + activationStatus + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
