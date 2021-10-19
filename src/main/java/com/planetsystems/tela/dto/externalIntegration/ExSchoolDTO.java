package com.planetsystems.tela.dto.externalIntegration;

import java.io.Serializable;

public class ExSchoolDTO implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private String EMISNumber;
	private String name;
	private String latitude;
	private String longitude;
	private String districtCode;
	private String districtName;
	private String deviceNumber; // Phone Serial number

	public ExSchoolDTO() {

	}

	public String getEMISNumber() {
		return EMISNumber;
	}

	public void setEMISNumber(String eMISNumber) {
		EMISNumber = eMISNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getDeviceNumber() {
		return deviceNumber;
	}

	public void setDeviceNumber(String deviceNumber) {
		this.deviceNumber = deviceNumber;
	}

}
