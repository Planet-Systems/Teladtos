package com.planetsystems.tela.dto;

public class SystemUserGroupSystemMenuDTO extends ParentDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SystemUserGroupDTO systemUserGroupDTO;
	private SystemMenuDTO systemMenuDTO;

	private boolean disabled;

	public SystemUserGroupSystemMenuDTO() {

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

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}
}
