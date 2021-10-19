package com.planetsystems.tela.dto.reports;

import java.io.Serializable;

public class SchoolTimeOnTaskSummaryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String year;
	private String term;
	private String taskDay;
	private String taskDate;
	private String schoolClass;
	private String school;

	private String Subject;
	private String staff;
	private String startTime;
	private String endTime;

	private String absentismStatus;
	private String absentismComment;

	private String supervisor;
	private String prensetismStatus;
	private String prensetismComment;

	public SchoolTimeOnTaskSummaryDTO() {

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

	public String getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}

	public String getTaskDay() {
		return taskDay;
	}

	public void setTaskDay(String taskDay) {
		this.taskDay = taskDay;
	}

	public String getSchoolClass() {
		return schoolClass;
	}

	public void setSchoolClass(String schoolClass) {
		this.schoolClass = schoolClass;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getStaff() {
		return staff;
	}

	public void setStaff(String staff) {
		this.staff = staff;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getAbsentismStatus() {
		return absentismStatus;
	}

	public void setAbsentismStatus(String absentismStatus) {
		this.absentismStatus = absentismStatus;
	}

	public String getAbsentismComment() {
		return absentismComment;
	}

	public void setAbsentismComment(String absentismComment) {
		this.absentismComment = absentismComment;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public String getPrensetismStatus() {
		return prensetismStatus;
	}

	public void setPrensetismStatus(String prensetismStatus) {
		this.prensetismStatus = prensetismStatus;
	}

	public String getPrensetismComment() {
		return prensetismComment;
	}

	public void setPrensetismComment(String prensetismComment) {
		this.prensetismComment = prensetismComment;
	}

}
