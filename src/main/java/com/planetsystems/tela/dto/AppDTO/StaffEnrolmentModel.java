package com.planetsystems.tela.dto.AppDTO;

import java.io.Serializable;

public class StaffEnrolmentModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String schoolId;
	private String deviceNo;
	private long totalMale;
	private long totalFemale;
	private long totalStaff;
	private String submissionDate;
	private String localId;

	private String created;
	private String updated;
	private String deleted;

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

	public String getLocalId() {
		return localId;
	}

	public void setLocalId(String localId) {
		this.localId = localId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}
