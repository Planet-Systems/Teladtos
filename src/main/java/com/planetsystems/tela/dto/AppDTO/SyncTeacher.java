package com.planetsystems.tela.dto.AppDTO;

import java.io.Serializable;

public class SyncTeacher implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String nationalId;
	private String employeeNumber;
	private String firstName;
	private String lastName;

	private boolean licensed;
	private String phoneNumber;
	private String emailAddress;
	private String schoolId;

	private String initials;
	private String gender;
	private String dob;
	private String MPSComputerNumber;

	private String role;

	// private byte[] fingerPrint;

	// private String fingerPrintImage;

	private String dateCreated;
	private String dateUpdated;
	private String status;

	private String localId;
	private boolean deleted;
	private boolean updated;
	private boolean created;
	
	private boolean onPayroll;
	private boolean teachingStaff;

	public SyncTeacher() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isLicensed() {
		return licensed;
	}

	public void setLicensed(boolean licensed) {
		this.licensed = licensed;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMPSComputerNumber() {
		return MPSComputerNumber;
	}

	public void setMPSComputerNumber(String mPSComputerNumber) {
		MPSComputerNumber = mPSComputerNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public boolean isCreated() {
		return created;
	}

	public void setCreated(boolean created) {
		this.created = created;
	}

	public boolean isOnPayroll() {
		return onPayroll;
	}

	public void setOnPayroll(boolean onPayroll) {
		this.onPayroll = onPayroll;
	}

	public boolean isTeachingStaff() {
		return teachingStaff;
	}

	public void setTeachingStaff(boolean teachingStaff) {
		this.teachingStaff = teachingStaff;
	}

}
