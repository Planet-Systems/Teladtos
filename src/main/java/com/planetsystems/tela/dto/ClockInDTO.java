package com.planetsystems.tela.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClockInDTO extends ParentDTO{
	private static final long serialVersionUID = 1L;

	private AcademicTermDTO academicTermDTO;

    private SchoolStaffDTO schoolStaffDTO;
    
    private SchoolDTO schoolDTO;

    private String clockInDate;
    private String clockInTime;
    private String comment;
    private String latitude;
    private String longitude;
    private String status;

    public ClockInDTO() {
    }

    public ClockInDTO(String id) {
        super(id);
    }

    public AcademicTermDTO getAcademicTermDTO() {
        return academicTermDTO;
    }

    public void setAcademicTermDTO(AcademicTermDTO academicTermDTO) {
        this.academicTermDTO = academicTermDTO;
    }

    public SchoolStaffDTO getSchoolStaffDTO() {
        return schoolStaffDTO;
    }

    public void setSchoolStaffDTO(SchoolStaffDTO schoolStaffDTO) {
        this.schoolStaffDTO = schoolStaffDTO;
    }

    public SchoolDTO getSchoolDTO() {
        return schoolDTO;
    }

    public void setSchoolDTO(SchoolDTO schoolDTO) {
        this.schoolDTO = schoolDTO;
    }

    public String getClockInDate() {
        return clockInDate;
    }

    public void setClockInDate(String clockInDate) {
        this.clockInDate = clockInDate;
    }

    public String getClockInTime() {
        return clockInTime;
    }

    public void setClockInTime(String clockInTime) {
        this.clockInTime = clockInTime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClockInDTO{");
        sb.append("academicTermDTO=").append(academicTermDTO);
        sb.append(", schoolStaffDTO=").append(schoolStaffDTO);
        sb.append(", schoolDTO=").append(schoolDTO);
        sb.append(", clockInDate='").append(clockInDate).append('\'');
        sb.append(", clockInTime='").append(clockInTime).append('\'');
        sb.append(", comment='").append(comment).append('\'');
        sb.append(", latitude='").append(latitude).append('\'');
        sb.append(", longitude='").append(longitude).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
