package com.planetsystems.tela.dto.AppDTO;

import java.io.Serializable;

public class StaffEnrolmentModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String schoolId; 
	private String deviceNo; 
	private long totalMale;
	private long totalFemale;
	private long totalStaff;
	private String submissionDate;
	
	public StaffEnrolmentModel() {
		
	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getDeviceNo() {
		return deviceNo;
	}

	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
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

	public long getTotalStaff() {
		return totalStaff;
	}

	public void setTotalStaff(long totalStaff) {
		this.totalStaff = totalStaff;
	}

	public String getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}
	
	
}
