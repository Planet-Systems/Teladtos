package com.planetsystems.tela.dto.externalIntegration;

import java.io.Serializable;

public class ExEndOfTermStaffAttendanceReportDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String term;
	private int malePresent;
	private int femalePresent;
	private int maleAbsent;
	private int femaleAbsent;
	private int totalPresent;
	
	public ExEndOfTermStaffAttendanceReportDTO() {
		
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
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
