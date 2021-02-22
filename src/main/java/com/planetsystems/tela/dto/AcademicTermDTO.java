package com.planetsystems.tela.dto;

import io.swagger.annotations.ApiModel;

@ApiModel("Academic term details")
public class AcademicTermDTO extends ParentDTO{
    private String code;
    private String term;
    private String activationStatus;
    private String startDate;
    private String endDate;

    private AcademicYearDTO academicYear;

    public AcademicTermDTO() {
    }


    public AcademicTermDTO(String id) {
        super(id);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
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

    public AcademicYearDTO getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(AcademicYearDTO academicYear) {
        this.academicYear = academicYear;
    }

    @Override
    public String toString() {
        return "AcademicTermDTO{" +
                "code='" + code + '\'' +
                ", term='" + term + '\'' +
                ", activationStatus='" + activationStatus + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", academicYear=" + academicYear +
                '}';
    }
}
