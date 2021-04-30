package com.planetsystems.tela.dto.reports.outputs;

import java.io.Serializable;

public class NationalMonthlyReportInput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cn; // counter
	private String dN; // District name
	private String w1; // week 1
	private String w2; // week 2
	private String w3; // week 3
	private String w4; // week 4
	private String ths; // totalHours
	private String ex; // expectedHours
	private String vr; // variance
	private String p; // percent

	public NationalMonthlyReportInput() {

	}

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getdN() {
		return dN;
	}

	public void setdN(String dN) {
		this.dN = dN;
	}

	public String getW1() {
		return w1;
	}

	public void setW1(String w1) {
		this.w1 = w1;
	}

	public String getW2() {
		return w2;
	}

	public void setW2(String w2) {
		this.w2 = w2;
	}

	public String getW3() {
		return w3;
	}

	public void setW3(String w3) {
		this.w3 = w3;
	}

	public String getW4() {
		return w4;
	}

	public void setW4(String w4) {
		this.w4 = w4;
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
