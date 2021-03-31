package com.planetsystems.tela.dto.AppDTO;

import java.io.Serializable;

public class SyncAttendanceRecord implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String deploymentUnitId;
	private String deploymentUnit;
	private long malePresent;
	private long femalePresent;
	private long maleAbsent;
	private long femaleAbsent;
	private String comment;
	private String submissionDate;
	private String taskDay;
	private String supervisorId;
	
	private String id;
	private String dateCreated;
	private String dateUpdated;
	private String status;

	public SyncAttendanceRecord() {

	}

	public String getDeploymentUnitId() {
		return deploymentUnitId;
	}

	public void setDeploymentUnitId(String deploymentUnitId) {
		this.deploymentUnitId = deploymentUnitId;
	}

	public String getDeploymentUnit() {
		return deploymentUnit;
	}

	public void setDeploymentUnit(String deploymentUnit) {
		this.deploymentUnit = deploymentUnit;
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

}
