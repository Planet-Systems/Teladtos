package com.planetsystems.tela.dto;

public class StaffEnrollmentDto extends ParentDTO {

    private SchoolDTO schoolDTO;

    private AcademicTermDTO academicTermDTO;


    private long  totalMale;

    private long totalFemale;

    private String status;


    public StaffEnrollmentDto() {
    }

    public SchoolDTO getSchoolDTO() {
        return schoolDTO;
    }

    public void setSchoolDTO(SchoolDTO schoolDTO) {
        this.schoolDTO = schoolDTO;
    }

    public AcademicTermDTO getAcademicTermDTO() {
        return academicTermDTO;
    }

    public void setAcademicTermDTO(AcademicTermDTO academicTermDTO) {
        this.academicTermDTO = academicTermDTO;
    }

    public long getTotalMale() {
        return totalMale;
    }

    public void setTotalMale(long totalMale) {
        this.totalMale = totalMale;
    }

    public long getTotalFemale() {
        return totalFemale;
    }

    public void setTotalFemale(long totalFemale) {
        this.totalFemale = totalFemale;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
}
