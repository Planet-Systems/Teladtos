package com.planetsystems.tela.dto.reports;

import java.io.Serializable;
import java.util.List;

public class HeadTeacherSupervisionReportDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String date;
	private String school;
	private String district;
	private String year;
	private String term;
	private String teacher;
	
	private List<HeadTeacherSupervisionCriteria> mrow_inputs;

	public HeadTeacherSupervisionReportDTO() {

	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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
  
	 

	public List<HeadTeacherSupervisionCriteria> getMrow_inputs() {
		return mrow_inputs;
	}

	public void setMrow_inputs(List<HeadTeacherSupervisionCriteria> mrow_inputs) {
		this.mrow_inputs = mrow_inputs;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

}
