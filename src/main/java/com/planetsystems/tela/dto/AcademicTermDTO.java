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

    public AcademicYearDTO getAcademicYearDTO() {
        return academicYearDTO;
    }

    public void setAcademicYearDTO(AcademicYearDTO academicYearDTO) {
        this.academicYearDTO = academicYearDTO;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AcademicTermDTO{");
        sb.append("code='").append(code).append('\'');
        sb.append(", term='").append(term).append('\'');
        sb.append(", activationStatus='").append(activationStatus).append('\'');
        sb.append(", startDate='").append(startDate).append('\'');
        sb.append(", endDate='").append(endDate).append('\'');
        sb.append(", academicYearDTO=").append(academicYearDTO);
        sb.append('}');
        return sb.toString();
    }
}
