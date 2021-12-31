package com.planetsystems.tela.dto.externalIntegration;

import java.io.Serializable;

public class ExSchoolEndOfTermLearnerAttendanceReportDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String school;
	private String term;
	private long girlsPresent;
	private long boysPresent;
	private long boysAbsent;
	private long girlsAbsent;
	private String year;

	public ExSchoolEndOfTermLearnerAttendanceReportDTO() {

	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
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

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
