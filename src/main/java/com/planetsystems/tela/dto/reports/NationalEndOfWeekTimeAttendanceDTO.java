package com.planetsystems.tela.dto.reports;

import java.io.Serializable;

public class NationalEndOfWeekTimeAttendanceDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String year;
	private String term;
	private String district;

	private String mon;
	private String TUE;
	private String wed;
	private String thur;
	private String fri;
	private String sat;
	private String sun;

	private double totalWorkHours;
	private double expectedHours;
	private double percentage;
	private double balance;
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
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getMon() {
		return mon;
	}
	public void setMon(String mon) {
		this.mon = mon;
	}
	public String getTUE() {
		return TUE;
	}
	public void setTUE(String tUE) {
		TUE = tUE;
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
