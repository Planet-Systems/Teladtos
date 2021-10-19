package com.planetsystems.tela.dto.externalIntegration;

import java.io.Serializable;

public class ExEndOfTermLearnerAttendanceReportDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String schoolClass;
	private String term;
	private long girlsPresent;
	private long boysPresent;
	private long boysAbsent;
	private long girlsAbsent; 
	
	public ExEndOfTermLearnerAttendanceReportDTO() {
		
	}

	public String getSchoolClass() {
		return schoolClass;
	}

	public void setSchoolClass(String schoolClass) {
		this.schoolClass = schoolClass;
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
	
	
}
