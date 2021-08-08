package com.planetsystems.tela.dto.reports.outputs;

import java.io.Serializable;

public class SubjectsTeachingStatusInput implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cn;
	private String date;
	private String day;
	private String cl;
	private String subject;
	private String status;
	private String comment;

	public SubjectsTeachingStatusInput() {

	}

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

	public String getCl() {
		return cl;
	}

	public void setCl(String cl) {
		this.cl = cl;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
