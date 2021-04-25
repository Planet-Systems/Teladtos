package com.planetsystems.tela.dto.reports;

import java.io.Serializable;

public class TeacherClockInSummaryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String year;
	private String term;
	private String school;

	private String taskDay;
	private String staff;

	private String clockInDate;
	private String clockInTime;
	private String clockOutTime;

	private double totalWorkHours;
	private double expectedHours;
	private double percentage;
	private double balance;

	public TeacherClockInSummaryDTO() {

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

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getTaskDay() {
		return taskDay;
	}

	public void setTaskDay(String taskDay) {
		this.taskDay = taskDay;
	}

	public String getStaff() {
		return staff;
	}

	public void setStaff(String staff) {
		this.staff = staff;
	}

	public String getClockInDate() {
		return clockInDate;
	}

	public void setClockInDate(String clockInDate) {
		this.clockInDate = clockInDate;
	}

	public String getClockInTime() {
		return clockInTime;
	}

	public void setClockInTime(String clockInTime) {
		this.clockInTime = clockInTime;
	}

	public String getClockOutTime() {
		return clockOutTime;
	}

	public void setClockOutTime(String clockOutTime) {
		this.clockOutTime = clockOutTime;
	}

	public double getTotalWorkHours() {
		return totalWorkHours;
	}

	public void setTotalWorkHours(double totalWorkHours) {
		this.totalWorkHours = totalWorkHours;
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
