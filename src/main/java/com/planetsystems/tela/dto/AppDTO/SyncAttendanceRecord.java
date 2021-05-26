package com.planetsystems.tela.dto.AppDTO;

import java.io.Serializable;

public class SyncAttendanceRecord implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String classId;
	private String className;
	private long malePresent;
	private long femalePresent;
	private long maleAbsent;
	private long femaleAbsent;
	private String comment;
	private String submissionDate;
	private String taskDay;
	private String supervisorId;
	private String staffId;

	
	private String dateCreated;
	private String dateUpdated;
	private String status; 
	private String localId;

	private String academicTermId;
	private String classIdLocal;
	private boolean created;
	private String createdDateTime;
	private boolean deleted;
	private String message;
	
	private boolean updated;
	private String updatedDateTime;

	public SyncAttendanceRecord() {

	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public long getMalePresent() {
		return malePresent;
	}

	public void setMalePresent(long malePresent) {
		this.malePresent = malePresent;
	}

	public long getFemalePresent() {
		return femalePresent;
	}

	public void setFemalePresent(long femalePresent) {
		this.femalePresent = femalePresent;
	}

	public long getMaleAbsent() {
		return maleAbsent;
	}

	public void setMaleAbsent(long maleAbsent) {
		this.maleAbsent = maleAbsent;
	}

	public long getFemaleAbsent() {
		return femaleAbsent;
	}

	public void setFemaleAbsent(long femaleAbsent) {
		this.femaleAbsent = femaleAbsent;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}

	public String getTaskDay() {
		return taskDay;
	}

	public void setTaskDay(String taskDay) {
		this.taskDay = taskDay;
	}

	public String getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLocalId() {
		return localId;
	}

	public void setLocalId(String localId) {
		this.localId = localId;
	}

	public String getAcademicTermId() {
		return academicTermId;
	}

	public void setAcademicTermId(String academicTermId) {
		this.academicTermId = academicTermId;
	}

	public String getClassIdLocal() {
		return classIdLocal;
	}

	public void setClassIdLocal(String classIdLocal) {
		this.classIdLocal = classIdLocal;
	}

	public boolean isCreated() {
		return created;
	}

	public void setCreated(boolean created) {
		this.created = created;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
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

}
