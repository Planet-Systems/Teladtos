package com.planetsystems.tela.dto.exports;

import java.io.Serializable;

public class SchoolExportDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String emisNumber;
	private String telaUID;
	private String name;
	private String category;
	private String latitude;
	private String longitude;
	private String district;
	private String telephoneNumber;
	private String schoolLevel;
	private String schoolOwnership;
	private String schoolType;
	private String schoolGenderCategory;
	private String licensed;
	private String rolloutPhase;
	private String telaSchoolNumber;
	

	public SchoolExportDTO() {

	}

	public String getEmisNumber() {
		return emisNumber;
	}

	public void setEmisNumber(String emisNumber) {
		this.emisNumber = emisNumber;
	}

	public String getTelaUID() {
		return telaUID;
	}

	public void setTelaUID(String telaUID) {
		this.telaUID = telaUID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getSchoolLevel() {
		return schoolLevel;
	}

	public void setSchoolLevel(String schoolLevel) {
		this.schoolLevel = schoolLevel;
	}

	public String getSchoolOwnership() {
		return schoolOwnership;
	}

	public void setSchoolOwnership(String schoolOwnership) {
		this.schoolOwnership = schoolOwnership;
	}

	public String getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public String getSchoolGenderCategory() {
		return schoolGenderCategory;
	}

	public void setSchoolGenderCategory(String schoolGenderCategory) {
		this.schoolGenderCategory = schoolGenderCategory;
	}

	public String getLicensed() {
		return licensed;
	}

	public void setLicensed(String licensed) {
		this.licensed = licensed;
	}

	public String getRolloutPhase() {
		return rolloutPhase;
	}

	public void setRolloutPhase(String rolloutPhase) {
		this.rolloutPhase = rolloutPhase;
	}

	public String getTelaSchoolNumber() {
		return telaSchoolNumber;
	}

	public void setTelaSchoolNumber(String telaSchoolNumber) {
		this.telaSchoolNumber = telaSchoolNumber;
	}

}
