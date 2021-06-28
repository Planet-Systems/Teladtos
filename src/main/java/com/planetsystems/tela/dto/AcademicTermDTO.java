package com.planetsystems.tela.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AcademicTermDTO extends ParentDTO{
	
	private String code;
    private String term;
    private String activationStatus;
    private String startDate;
    private String endDate;

    private AcademicYearDTO academicYearDTO;

    public AcademicTermDTO() {
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

    public AcademicYearDTO getAcademicYearDTO() {
        return academicYearDTO;
    }

    public void setAcademicYearDTO(AcademicYearDTO academicYearDTO) {
        this.academicYearDTO = academicYearDTO;
    }

}
