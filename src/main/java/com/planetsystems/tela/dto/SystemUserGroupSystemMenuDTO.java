package com.planetsystems.tela.dto;


public class SystemUserGroupSystemMenuDTO extends ParentDTO {
	private static final long serialVersionUID = 1L;
	private SystemUserGroupDTO systemUserGroupDTO;
	private SystemMenuDTO systemMenuDTO;
	private SystemUserProfileDTO createdBy;
	private SystemUserProfileDTO updatedBy;
	private boolean selected;

	public SystemUserGroupSystemMenuDTO() {
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public SystemUserGroupDTO getSystemUserGroupDTO() {
		return systemUserGroupDTO;
	}

	public void setSystemUserGroupDTO(SystemUserGroupDTO systemUserGroupDTO) {
		this.systemUserGroupDTO = systemUserGroupDTO;
	}

	public SystemMenuDTO getSystemMenuDTO() {
		return systemMenuDTO;
	}

	public void setSystemMenuDTO(SystemMenuDTO systemMenuDTO) {
		this.systemMenuDTO = systemMenuDTO;
	}

	public SystemUserProfileDTO getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(SystemUserProfileDTO createdBy) {
		this.createdBy = createdBy;
	}

	public SystemUserProfileDTO getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(SystemUserProfileDTO updatedBy) {
		this.updatedBy = updatedBy;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
