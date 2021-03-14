package com.planetsystems.tela.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClockInDTO extends ParentDTO{

     
	/**
	 * 
	 */
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

    public String getClockInDate() {
        return clockInDate;
    }

    public void setClockInDate(String clockInDate) {
        this.clockInDate = clockInDate;
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

    public String getClockInTime() {
        return clockInTime;
    }

    public void setClockInTime(String clockInTime) {
        this.clockInTime = clockInTime;
    }

    public SchoolDTO getSchoolDTO() {
		return schoolDTO;
	}

	public void setSchoolDTO(SchoolDTO schoolDTO) {
		this.schoolDTO = schoolDTO;
	}

	/*@Override
    public String toString() {
        return "ClockInDTO{" +
                "academicTermDTO=" + academicTermDTO +
                ", schoolStaffDTO=" + schoolStaffDTO +
                ", clockInDate='" + clockInDate + '\'' +
                ", clockInTime='" + clockInTime + '\'' +
                ", comment='" + comment + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", status='" + status + '\'' +
                ", createdDate= "+super.getCreatedDateTime()+
                '}';
    }*/
}
