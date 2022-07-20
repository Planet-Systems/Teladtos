package com.planetsystems.tela.dto.AppDTO;

import java.io.Serializable;

public class SyncSNLearnerEnrollmentDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private long totalMale;
	private long totalFemale;
	private String submissionDate;
	
	private String localId;
	private String createdDateTime;
	private boolean deleted;
	private boolean updated;
	private String updatedDateTime;
	private String classId;
	private String classIdLocal;
	private int enrollmentStatus;
	private boolean created;
	private String schoolId;
	private String submitedBy;
	
	public SyncSNLearnerEnrollmentDTO() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getLocalId() {
		return localId;
	}

	public void setLocalId(String localId) {
		this.localId = localId;
	}

	public String getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public boolean isUpdated() {
		return updated;
	}

	public void setUpdated(boolean updated) {
		this.updated = updated;
	}

	public String getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(String updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassIdLocal() {
		return classIdLocal;
	}

	public void setClassIdLocal(String classIdLocal) {
		this.classIdLocal = classIdLocal;
	}

	public int getEnrollmentStatus() {
		return enrollmentStatus;
	}

	public void setEnrollmentStatus(int enrollmentStatus) {
		this.enrollmentStatus = enrollmentStatus;
	}

	public boolean isCreated() {
		return created;
	}

	public void setCreated(boolean created) {
		this.created = created;
	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSubmitedBy() {
		return submitedBy;
	}

	public void setSubmitedBy(String submitedBy) {
		this.submitedBy = submitedBy;
	}
	
	

}
