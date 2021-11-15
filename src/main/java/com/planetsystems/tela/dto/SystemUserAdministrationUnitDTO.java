package com.planetsystems.tela.dto;

public class SystemUserAdministrationUnitDTO extends ParentDTO {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;

	private SystemUserProfileDTO systemUserProfile;

	private String adminstrationUnitId;
	private String adminstrationUnit;
	private String administrationLevel;
	private String activationStatus;
	  
	public SystemUserAdministrationUnitDTO() {

	}

	public SystemUserProfileDTO getSystemUserProfile() {
		return systemUserProfile;
	}

	public void setSystemUserProfile(SystemUserProfileDTO systemUserProfile) {
		this.systemUserProfile = systemUserProfile;
	}

	public String getAdminstrationUnitId() {
		return adminstrationUnitId;
	}

	public void setAdminstrationUnitId(String adminstrationUnitId) {
		this.adminstrationUnitId = adminstrationUnitId;
	}

	public String getAdminstrationUnit() {
		return adminstrationUnit;
	}

	public void setAdminstrationUnit(String adminstrationUnit) {
		this.adminstrationUnit = adminstrationUnit;
	}

	public String getAdministrationLevel() {
		return administrationLevel;
	}

	public void setAdministrationLevel(String administrationLevel) {
		this.administrationLevel = administrationLevel;
	}

	public String getActivationStatus() {
		return activationStatus;
	}

	public void setActivationStatus(String activationStatus) {
		this.activationStatus = activationStatus;
	}

}
