package com.planetsystems.tela.dto.reports;

import java.io.Serializable;

public class HeadTeacherSupervisionCriteria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String no;
	private String criteria;
	private String value;
	
	public  HeadTeacherSupervisionCriteria() {
		
	}

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	
	  
}
