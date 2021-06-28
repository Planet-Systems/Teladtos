package com.planetsystems.tela.dto;

public class LearnerEnrollmentDTO extends ParentDTO {

    private SchoolClassDTO schoolClassDTO;
    private long totalBoys;
    private long totalGirls;
    private String status;

    public LearnerEnrollmentDTO() {
    }

    public SchoolClassDTO getSchoolClassDTO() {
        return schoolClassDTO;
    }

    public void setSchoolClassDTO(SchoolClassDTO schoolClassDTO) {
        this.schoolClassDTO = schoolClassDTO;
    }

    public long getTotalBoys() {
        return totalBoys;
    }

    public void setTotalBoys(long totalBoys) {
        this.totalBoys = totalBoys;
    }

    public long getTotalGirls() {
        return totalGirls;
    }

    public void setTotalGirls(long totalGirls) {
        this.totalGirls = totalGirls;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
