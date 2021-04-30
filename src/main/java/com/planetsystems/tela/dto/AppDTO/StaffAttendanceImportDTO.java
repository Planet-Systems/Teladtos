package com.planetsystems.tela.dto.AppDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.planetsystems.tela.dto.AcademicTermDTO; 
import com.planetsystems.tela.dto.ParentDTO;
import com.planetsystems.tela.dto.SchoolDTO;
import com.planetsystems.tela.dto.SchoolStaffDTO;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StaffAttendanceImportDTO extends ParentDTO {

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

	private String clockoutcomment;
	private String clockOutDate;
	private String clockOutTime;
	private String clockoutStatus;

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

	public String getClockoutcomment() {
		return clockoutcomment;
	}

	public void setClockoutcomment(String clockoutcomment) {
		this.clockoutcomment = clockoutcomment;
	}

	public String getClockOutDate() {
		return clockOutDate;
	}

	public void setClockOutDate(String clockOutDate) {
		this.clockOutDate = clockOutDate;
	}

	public String getClockOutTime() {
		return clockOutTime;
	}

	public void setClockOutTime(String clockOutTime) {
		this.clockOutTime = clockOutTime;
	}

	public String getClockoutStatus() {
		return clockoutStatus;
	}

	public void setClockoutStatus(String clockoutStatus) {
		this.clockoutStatus = clockoutStatus;
	}

}
