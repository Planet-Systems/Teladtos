package com.planetsystems.tela.dto.AppDTO;

import java.io.Serializable;

public class SyncConfirmTimeOnSiteAttendance implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String employeeId;
	private String employeeNo;
	private String supervisionDay;
	private String supervisorId;
	private String supervisorComment;
	private String supervisionStatus;
	private String supervisionDate;
	
	private String dateCreated;
	private String dateUpdated;
	private String status;
	
	public SyncConfirmTimeOnSiteAttendance(){
		
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getSupervisionDay() {
		return supervisionDay;
	}

	public void setSupervisionDay(String supervisionDay) {
		this.supervisionDay = supervisionDay;
	}

	public String getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}

	public String getSupervisorComment() {
		return supervisorComment;
	}

	public void setSupervisorComment(String supervisorComment) {
		this.supervisorComment = supervisorComment;
	}

	public String getSupervisionStatus() {
		return supervisionStatus;
	}

	public void setSupervisionStatus(String supervisionStatus) {
		this.supervisionStatus = supervisionStatus;
	}

	public String getSupervisionDate() {
		return supervisionDate;
	}

	public void setSupervisionDate(String supervisionDate) {
		this.supervisionDate = supervisionDate;
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
