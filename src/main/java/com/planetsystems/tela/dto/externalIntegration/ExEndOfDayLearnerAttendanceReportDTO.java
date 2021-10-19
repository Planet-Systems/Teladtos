package com.planetsystems.tela.dto.externalIntegration;

import java.io.Serializable;

public class ExEndOfDayLearnerAttendanceReportDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String schoolClass;
	private String attendanceDate;
	private long girlsPresent;
	private long boysPresent;
	private long boysAbsent;
	private long girlsAbsent;
	private String comment;

	public ExEndOfDayLearnerAttendanceReportDTO() {

	}

	public String getSchoolClass() {
		return schoolClass;
	}

	public void setSchoolClass(String schoolClass) {
		this.schoolClass = schoolClass;
	}

	public String getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(String attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	public long getGirlsPresent() {
		return girlsPresent;
	}

	public void setGirlsPresent(long girlsPresent) {
		this.girlsPresent = girlsPresent;
	}

	public long getBoysPresent() {
		return boysPresent;
	}

	public void setBoysPresent(long boysPresent) {
		this.boysPresent = boysPresent;
	}

	public long getBoysAbsent() {
		return boysAbsent;
	}

	public void setBoysAbsent(long boysAbsent) {
		this.boysAbsent = boysAbsent;
	}

	public long getGirlsAbsent() {
		return girlsAbsent;
	}

	public void setGirlsAbsent(long girlsAbsent) {
		this.girlsAbsent = girlsAbsent;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
