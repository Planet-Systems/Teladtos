package com.planetsystems.tela.dto.exports;

import java.io.Serializable;

public class TelaSchoolLicenseExportDTO implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private String subregion;
	private String district;
	private String school;
	private String telaNumber;
	private String telaNumber2;
	private String licenseKey;

	public TelaSchoolLicenseExportDTO() {

	}

	public String getSubregion() {
		return subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getTelaNumber() {
		return telaNumber;
	}

	public void setTelaNumber(String telaNumber) {
		this.telaNumber = telaNumber;
	}

	public String getLicenseKey() {
		return licenseKey;
	}

	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}

	public String getTelaNumber2() {
		return telaNumber2;
	}

	public void setTelaNumber2(String telaNumber2) {
		this.telaNumber2 = telaNumber2;
	}
	

}
