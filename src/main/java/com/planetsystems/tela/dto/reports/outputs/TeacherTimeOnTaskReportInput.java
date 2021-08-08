package com.planetsystems.tela.dto.reports.outputs;

import java.io.Serializable;

public class TeacherTimeOnTaskReportInput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String cn; // counter
	private String cls; // class
	private String sb; // class
	private String m; // mon
	private String t; // tue
	private String w; // wed
	private String th; // thurs
	private String f; // fri
	private String ths; // totalHours
	private String ex; // expectedHours
	private String vr; // variance
	private String p; // percent

	public TeacherTimeOnTaskReportInput() {

	}

	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getCls() {
		return cls;
	}

	public void setCls(String cls) {
		this.cls = cls;
	}

	public String getSb() {
		return sb;
	}

	public void setSb(String sb) {
		this.sb = sb;
	}

	public String getM() {
		return m;
	}

	public void setM(String m) {
		this.m = m;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public String getW() {
		return w;
	}

	public void setW(String w) {
		this.w = w;
	}

	public String getTh() {
		return th;
	}

	public void setTh(String th) {
		this.th = th;
	}

	public String getF() {
		return f;
	}

	public void setF(String f) {
		this.f = f;
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
