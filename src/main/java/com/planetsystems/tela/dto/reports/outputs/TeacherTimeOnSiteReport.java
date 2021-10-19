package com.planetsystems.tela.dto.reports.outputs;

import java.io.Serializable;
import java.util.List;

public class TeacherTimeOnSiteReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String academicYear;
	private String school;
	private String district;
	private String term;
	private String from;
	private String to;
	private String teacherName;
	private String teacherCode; 

	private List<TeacherTimeOnSiteReportInput> mrow_inputs;

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

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherCode() {
		return teacherCode;
	}

	public void setTeacherCode(String teacherCode) {
		this.teacherCode = teacherCode;
	}

	public List<TeacherTimeOnSiteReportInput> getMrow_inputs() {
		return mrow_inputs;
	}

	public void setMrow_inputs(List<TeacherTimeOnSiteReportInput> mrow_inputs) {
		this.mrow_inputs = mrow_inputs;
	}

	  
	

}
