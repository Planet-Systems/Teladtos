package com.planetsystems.tela.dto.reports;

import java.io.Serializable;
import java.util.List;
 

public class SchoolClockinSummaryReportDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String academicYear;
	private String school;
	private String district;
	private String term;
	private String date;  

	private List<SchoolClockinSummaryReportInputDTO> mrow_inputs;
	
	public SchoolClockinSummaryReportDTO() {
		
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<SchoolClockinSummaryReportInputDTO> getMrow_inputs() {
		return mrow_inputs;
	}

	public void setMrow_inputs(List<SchoolClockinSummaryReportInputDTO> mrow_inputs) {
		this.mrow_inputs = mrow_inputs;
	}
	
	
}
