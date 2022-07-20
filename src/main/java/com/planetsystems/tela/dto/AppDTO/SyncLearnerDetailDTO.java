package com.planetsystems.tela.dto.AppDTO;

import java.io.Serializable;
import java.util.List;

public class SyncLearnerDetailDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String learnTelaNo;
	private String firstName;
	private String lastName;
	private String otherName;
	private String nationality;
	private String homeDistrictId;
	private String homeDistrictName;
	private String dob;
	private String nationalId;
	private String gender;
	private String nameAbbrev;
	private String phoneNumber;
	private boolean hasSpecialNeeds;
	private String orphanCategory;

	private String schoolId;
	private String schoolClassId;
	private String schoolClassName;
	private String SubmissionDate;
	private String academicTermId;
	private String learnAdmissionNo;
	private String admissionDate;

	List<SyncLearnerGuardianDTO> guardians;

	private String localId;
	private boolean deleted;
	private boolean updated;
	private boolean created;

	public SyncLearnerDetailDTO() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLearnTelaNo() {
		return learnTelaNo;
	}

	public void setLearnTelaNo(String learnTelaNo) {
		this.learnTelaNo = learnTelaNo;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNameAbbrev() {
		return nameAbbrev;
	}

	public void setNameAbbrev(String nameAbbrev) {
		this.nameAbbrev = nameAbbrev;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isHasSpecialNeeds() {
		return hasSpecialNeeds;
	}

	public void setHasSpecialNeeds(boolean hasSpecialNeeds) {
		this.hasSpecialNeeds = hasSpecialNeeds;
	}

	public String getOrphanCategory() {
		return orphanCategory;
	}

	public void setOrphanCategory(String orphanCategory) {
		this.orphanCategory = orphanCategory;
	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolClassId() {
		return schoolClassId;
	}

	public void setSchoolClassId(String schoolClassId) {
		this.schoolClassId = schoolClassId;
	}

	public String getSchoolClassName() {
		return schoolClassName;
	}

	public void setSchoolClassName(String schoolClassName) {
		this.schoolClassName = schoolClassName;
	}

	public String getSubmissionDate() {
		return SubmissionDate;
	}

	public void setSubmissionDate(String submissionDate) {
		SubmissionDate = submissionDate;
	}

	public String getAcademicTermId() {
		return academicTermId;
	}

	public void setAcademicTermId(String academicTermId) {
		this.academicTermId = academicTermId;
	}

	public String getLearnAdmissionNo() {
		return learnAdmissionNo;
	}

	public void setLearnAdmissionNo(String learnAdmissionNo) {
		this.learnAdmissionNo = learnAdmissionNo;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public List<SyncLearnerGuardianDTO> getGuardians() {
		return guardians;
	}

	public void setGuardians(List<SyncLearnerGuardianDTO> guardians) {
		this.guardians = guardians;
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

	public String getOtherName() {
		return otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getHomeDistrictId() {
		return homeDistrictId;
	}

	public void setHomeDistrictId(String homeDistrictId) {
		this.homeDistrictId = homeDistrictId;
	}

	public String getHomeDistrictName() {
		return homeDistrictName;
	}

	public void setHomeDistrictName(String homeDistrictName) {
		this.homeDistrictName = homeDistrictName;
	}

}
