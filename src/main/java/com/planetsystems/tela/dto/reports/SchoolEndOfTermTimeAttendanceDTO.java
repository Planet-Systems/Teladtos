package com.planetsystems.tela.dto.reports;

import java.io.Serializable;

public class SchoolEndOfTermTimeAttendanceDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String operationYear;
	private String assessmentPeriod;

	private String staff;
	private String month1;
	private String month2;
	private String month3;

	private double totalTime;

	private double expectedHours;
	private double percentage;
	private double balance;
	
	public SchoolEndOfTermTimeAttendanceDTO() {
		
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

	public String getMonth1() {
		return month1;
	}

	public void setMonth1(String month1) {
		this.month1 = month1;
	}

	public String getMonth2() {
		return month2;
	}

	public void setMonth2(String month2) {
		this.month2 = month2;
	}

	public String getMonth3() {
		return month3;
	}

	public void setMonth3(String month3) {
		this.month3 = month3;
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
