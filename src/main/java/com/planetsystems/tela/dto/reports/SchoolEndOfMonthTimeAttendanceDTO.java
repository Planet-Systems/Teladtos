package com.planetsystems.tela.dto.reports;

import java.io.Serializable;

public class SchoolEndOfMonthTimeAttendanceDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String operationYear;
	private String assessmentPeriod;

	private String staff;
	
	private String week1;
	private String week2;
	private String week3;
	private String week4;

	private double totalTime; 
	private double expectedHours;
	private double percentage;
	private double balance;

	public SchoolEndOfMonthTimeAttendanceDTO() {

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

	public String getWeek1() {
		return week1;
	}

	public void setWeek1(String week1) {
		this.week1 = week1;
	}

	public String getWeek2() {
		return week2;
	}

	public void setWeek2(String week2) {
		this.week2 = week2;
	}

	public String getWeek3() {
		return week3;
	}

	public void setWeek3(String week3) {
		this.week3 = week3;
	}

	public String getWeek4() {
		return week4;
	}

	public void setWeek4(String week4) {
		this.week4 = week4;
	}

	public double getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(double totalTime) {
		this.totalTime = totalTime;
	}

	public double getExpectedHours() {
		return expectedHours;
	}

	public void setExpectedHours(double expectedHours) {
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
