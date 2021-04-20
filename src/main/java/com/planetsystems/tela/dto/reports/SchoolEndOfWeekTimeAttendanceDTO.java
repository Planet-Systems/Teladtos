package com.planetsystems.tela.dto.reports;

import java.io.Serializable;

public class SchoolEndOfWeekTimeAttendanceDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String operationYear;
	private String assessmentPeriod;
	private String staff;

	private String mon;
	private String tue;
	private String wed;
	private String thur;
	private String fri;
	private String sat;
	private String sun;

	private long totalTime;
	private long expectedHours;
	private double percentage;
	private double balance;

	public SchoolEndOfWeekTimeAttendanceDTO() {

	}

	public String getOperationYear() {
		return operationYear;
	}

	public void setOperationYear(String operationYear) {
		this.operationYear = operationYear;
	}

	public String getAssessmentPeriod() {
		return assessmentPeriod;
	}

	public void setAssessmentPeriod(String assessmentPeriod) {
		this.assessmentPeriod = assessmentPeriod;
	}

	public String getStaff() {
		return staff;
	}

	public void setStaff(String staff) {
		this.staff = staff;
	}

	public String getMon() {
		return mon;
	}

	public void setMon(String mon) {
		this.mon = mon;
	}

	public String getTue() {
		return tue;
	}

	public void setTue(String tue) {
		this.tue = tue;
	}

	public String getWed() {
		return wed;
	}

	public void setWed(String wed) {
		this.wed = wed;
	}

	public String getThur() {
		return thur;
	}

	public void setThur(String thur) {
		this.thur = thur;
	}

	public String getFri() {
		return fri;
	}

	public void setFri(String fri) {
		this.fri = fri;
	}

	public String getSat() {
		return sat;
	}

	public void setSat(String sat) {
		this.sat = sat;
	}

	public String getSun() {
		return sun;
	}

	public void setSun(String sun) {
		this.sun = sun;
	}

	public long getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(long totalTime) {
		this.totalTime = totalTime;
	}

	public long getExpectedHours() {
		return expectedHours;
	}

	public void setExpectedHours(long expectedHours) {
		this.expectedHours = expectedHours;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
