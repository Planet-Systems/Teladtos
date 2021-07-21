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

}
