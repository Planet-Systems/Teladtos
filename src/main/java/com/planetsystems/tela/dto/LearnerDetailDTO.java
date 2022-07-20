package com.planetsystems.tela.dto;

public class LearnerDetailDTO extends ParentDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	private String otherName;
	private String gender;
	private String nationality;
	private String dob;

	private DistrictDTO homeDistrict;
	private String nationalId;
	private String phoneNumber;
	private String learnTelaNo;
	private boolean hasSpecialNeeds;
	private String orphanCategory;

	public LearnerDetailDTO() {

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

	public String getOtherName() {
		return otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public DistrictDTO getHomeDistrict() {
		return homeDistrict;
	}

	public void setHomeDistrict(DistrictDTO homeDistrict) {
		this.homeDistrict = homeDistrict;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLearnTelaNo() {
		return learnTelaNo;
	}

	public void setLearnTelaNo(String learnTelaNo) {
		this.learnTelaNo = learnTelaNo;
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

}
