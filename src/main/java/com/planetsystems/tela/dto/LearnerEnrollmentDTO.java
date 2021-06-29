package com.planetsystems.tela.dto;

public class LearnerEnrollmentDTO extends ParentDTO {

    private SchoolClassDTO schoolClassDTO;
    private long totalBoys;
    private long totalGirls;
    private String status;

    public LearnerEnrollmentDTO() {
    }

    public LearnerEnrollmentDTO(String id) {
        super(id);
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LearnerEnrollmentDTO{");
        sb.append("schoolClassDTO=").append(schoolClassDTO);
        sb.append(", totalBoys=").append(totalBoys);
        sb.append(", totalGirls=").append(totalGirls);
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
