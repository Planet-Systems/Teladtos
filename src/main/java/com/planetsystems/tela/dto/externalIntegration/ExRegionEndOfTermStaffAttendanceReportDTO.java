package com.planetsystems.tela.dto.externalIntegration;

import java.io.Serializable;

public class ExRegionEndOfTermStaffAttendanceReportDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String year;
	private String term;
	private String region;
	private int malePresent;
	private int femalePresent;
	private int maleAbsent;
	private int femaleAbsent;
	private int totalPresent;
	
	public ExRegionEndOfTermStaffAttendanceReportDTO() {
		
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getMalePresent() {
		return malePresent;
	}

	public void setMalePresent(int malePresent) {
		this.malePresent = malePresent;
	}

	public int getFemalePresent() {
		return femalePresent;
	}

	public void setFemalePresent(int femalePresent) {
		this.femalePresent = femalePresent;
	}

	public int getMaleAbsent() {
		return maleAbsent;
	}

	public void setMaleAbsent(int maleAbsent) {
		this.maleAbsent = maleAbsent;
	}

	public int getFemaleAbsent() {
		return femaleAbsent;
	}

	public void setFemaleAbsent(int femaleAbsent) {
		this.femaleAbsent = femaleAbsent;
	}

	public int getTotalPresent() {
		return totalPresent;
	}

	public void setTotalPresent(int totalPresent) {
		this.totalPresent = totalPresent;
	}
	
	
}
