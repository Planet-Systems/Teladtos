package com.planetsystems.tela.dto.reports.outputs;

import java.io.Serializable;

public class TeacherTimeOnSiteReportInput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cn; // counter
	
	private String date;
	private String day;
	private String cin; // clockin time
	private String cout; // clockout time

	private String ths; // totalHours
	private String ex; // expectedHours
	private String vr; // variance
	private String p; // percent

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getCout() {
		return cout;
	}

	public void setCout(String cout) {
		this.cout = cout;
	}

	public String getThs() {
		return ths;
	}

	public void setThs(String ths) {
		this.ths = ths;
	}

	public String getEx() {
		return ex;
	}

	public void setEx(String ex) {
		this.ex = ex;
	}

	public String getVr() {
		return vr;
	}

	public void setVr(String vr) {
		this.vr = vr;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}

}
