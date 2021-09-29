package com.planetsystems.tela.dto.externalIntegration;

import java.io.Serializable;

public class HeadTeacherAttendanceReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int numberOfTimesPresent;
	private String term;

	public HeadTeacherAttendanceReport() {

	}

	public int getNumberOfTimesPresent() {
		return numberOfTimesPresent;
	}

	public void setNumberOfTimesPresent(int numberOfTimesPresent) {
		this.numberOfTimesPresent = numberOfTimesPresent;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

}
