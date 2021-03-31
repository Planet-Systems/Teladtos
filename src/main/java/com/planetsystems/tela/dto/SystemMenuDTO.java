package com.planetsystems.tela.dto;

public class SystemMenuDTO extends ParentDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String navigationMenu;
	private String subMenuItem;
	private String activativationSatus;

	public SystemMenuDTO() {

	}

	public String getNavigationMenu() {
		return navigationMenu;
	}

	public void setNavigationMenu(String navigationMenu) {
		this.navigationMenu = navigationMenu;
	}

	public String getSubMenuItem() {
		return subMenuItem;
	}

	public void setSubMenuItem(String subMenuItem) {
		this.subMenuItem = subMenuItem;
	}

	public String getActivativationSatus() {
		return activativationSatus;
	}

	public void setActivativationSatus(String activativationSatus) {
		this.activativationSatus = activativationSatus;
	}

}
