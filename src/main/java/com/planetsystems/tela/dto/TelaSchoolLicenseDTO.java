package com.planetsystems.tela.dto;

public class TelaSchoolLicenseDTO extends ParentDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TelaLicenseKeyDTO telaLicenseKey;
	private SchoolDTO school;
	private String activationStatus;
	
	public TelaSchoolLicenseDTO() {
		
	}

	public TelaLicenseKeyDTO getTelaLicenseKey() {
		return telaLicenseKey;
	}

	public void setTelaLicenseKey(TelaLicenseKeyDTO telaLicenseKey) {
		this.telaLicenseKey = telaLicenseKey;
	}

	public SchoolDTO getSchool() {
		return school;
	}

	public void setSchool(SchoolDTO school) {
		this.school = school;
	}

	public String getActivationStatus() {
		return activationStatus;
	}

	public void setActivationStatus(String activationStatus) {
		this.activationStatus = activationStatus;
	}
	
	
}
