package com.planetsystems.tela.dto.externalIntegration;

import java.io.Serializable;

public class ExRegionEndOfTermLearnerAttendanceReportDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String region;
	private String year;
	private String term;
	private long girlsPresent;
	private long boysPresent;
	private long boysAbsent;
	private long girlsAbsent;
	
	public ExRegionEndOfTermLearnerAttendanceReportDTO() {
		
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
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
