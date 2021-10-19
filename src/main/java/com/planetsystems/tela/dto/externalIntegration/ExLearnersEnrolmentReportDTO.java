package com.planetsystems.tela.dto.externalIntegration;

import java.io.Serializable;

public class ExLearnersEnrolmentReportDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String school;
	private String year;
	private String term;
	private String schoolClass;
	private int boys;
	private int girls;
	private int total;
	
	public ExLearnersEnrolmentReportDTO() {
		
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
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

	public String getSchoolClass() {
		return schoolClass;
	}

	public void setSchoolClass(String schoolClass) {
		this.schoolClass = schoolClass;
	}

	public int getBoys() {
		return boys;
	}

	public void setBoys(int boys) {
		this.boys = boys;
	}

	public int getGirls() {
		return girls;
	}

	public void setGirls(int girls) {
		this.girls = girls;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
