package com.planetsystems.tela.dto.AppDTO;

import java.io.Serializable;

public class SyncSchoolDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	private String code;
	private String deviceNumber; // Phone Serial number
	private String regNo;
	private String deploymentSiteName;
	private String location;

	private String latitude;
	private String longtitude;

	private String schoolLevel;
	private String schoolOwnership;
	private String schoolType;
	private String schoolGenderCategory;
	private boolean licensed;

	private String licenseKey;
	private String districtId;
	private String district;

	public SyncSchoolDTO() {

	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDeviceNumber() {
		return deviceNumber;
	}

	public void setDeviceNumber(String deviceNumber) {
		this.deviceNumber = deviceNumber;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getDeploymentSiteName() {
		return deploymentSiteName;
	}

	public void setDeploymentSiteName(String deploymentSiteName) {
		this.deploymentSiteName = deploymentSiteName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(String longtitude) {
		this.longtitude = longtitude;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public boolean isLicensed() {
		return licensed;
	}

	public void setLicensed(boolean licensed) {
		this.licensed = licensed;
	}

	public String getLicenseKey() {
		return licenseKey;
	}

	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}

	public String getDistrictId() {
		return districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

}
