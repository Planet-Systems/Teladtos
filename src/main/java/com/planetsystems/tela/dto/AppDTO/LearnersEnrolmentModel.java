package com.planetsystems.tela.dto.AppDTO;

import java.io.Serializable;

public class LearnersEnrolmentModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String classId;  
	private long totalMale;
	private long totalFemale; 
	private String submissionDate;
	
	public LearnersEnrolmentModel() {
		
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public long getTotalMale() {
		return totalMale;
	}

	public void setTotalMale(long totalMale) {
		this.totalMale = totalMale;
	}

	public long getTotalFemale() {
		return totalFemale;
	}

	public void setTotalFemale(long totalFemale) {
		this.totalFemale = totalFemale;
	}

	public String getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}
	
	
}
