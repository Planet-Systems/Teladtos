package com.planetsystems.tela.dto.AppDTO;

import java.io.Serializable;

public class SyncClockIn implements Serializable {

	private String id;
	private String employeeNo;
	private String employeeId;
	private String latitude;
	private String longitude;
	private String clockInDate;
	private String synStatus;
	private String day;
	private String clockInTime;

	private String schoolId;
	private String schoolName;

	private String empFirstName;
	private String empLastName;

	private String dateCreated;
	private String dateUpdated;
	private String status;
	private String genId;

	public SyncClockIn() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getClockInDate() {
		return clockInDate;
	}

	public void setClockInDate(String clockInDate) {
		this.clockInDate = clockInDate;
	}

	public String getSynStatus() {
		return synStatus;
	}

	public void setSynStatus(String synStatus) {
		this.synStatus = synStatus;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getClockInTime() {
		return clockInTime;
	}

	public void setClockInTime(String clockInTime) {
		this.clockInTime = clockInTime;
	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
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

	public String getGenId() {
		return genId;
	}

	public void setGenId(String genId) {
		this.genId = genId;
	}

}
