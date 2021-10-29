package com.planetsystems.tela.dto.dashboard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DailySchoolAttendanceEnrollmentSummaryDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String staffId;
	private String staff;
	private String role;
	private String clockInTime;

	public DailySchoolAttendanceEnrollmentSummaryDTO() {

	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getStaff() {
		return staff;
	}

	public void setStaff(String staff) {
		this.staff = staff;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getClockInTime() {
		return clockInTime;
	}

	public void setClockInTime(String clockInTime) {
		this.clockInTime = clockInTime;
	}

}
