package com.planetsystems.tela.dto;

public class SystemUserGroupSystemMenuDTO extends ParentDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SystemUserGroupDTO systemUserGroup;
	private SystemMenuDTO systemMenu;

	private boolean disabled;

	public SystemUserGroupSystemMenuDTO() {

	}

	public SystemUserGroupDTO getSystemUserGroup() {
		return systemUserGroup;
	}

	public void setSystemUserGroup(SystemUserGroupDTO systemUserGroup) {
		this.systemUserGroup = systemUserGroup;
	}

	public SystemMenuDTO getSystemMenu() {
		return systemMenu;
	}

	public void setSystemMenu(SystemMenuDTO systemMenu) {
		this.systemMenu = systemMenu;
	}

	public boolean isDisabled() {
		return disabled;
	}

	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}

}
