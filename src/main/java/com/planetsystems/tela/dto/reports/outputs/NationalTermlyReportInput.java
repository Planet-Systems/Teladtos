package com.planetsystems.tela.dto.reports.outputs;

import java.io.Serializable;

public class NationalTermlyReportInput implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String cn; // counter
	private String dN; // District name
	
	private String m1; // week 1
	private String m2; // week 2
	private String m3; // week 3 
	
	private String ths; // totalHours
	private String ex; // expectedHours
	private String vr; // variance
	private String p; // percent
	
	public NationalTermlyReportInput() {
		
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

	public String getM1() {
		return m1;
	}

	public void setM1(String m1) {
		this.m1 = m1;
	}

	public String getM2() {
		return m2;
	}

	public void setM2(String m2) {
		this.m2 = m2;
	}

	public String getM3() {
		return m3;
	}

	public void setM3(String m3) {
		this.m3 = m3;
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
