package com.planetsystems.tela.dto;

public enum NavigationMenuDTO {
	 
	SYSTEM_CONFIGURATION("System Administration"),
	ENROLLMENT("Enrollment"),
	ATTENDANCE("Attendance"),
	TIMETABLE("Timetables"),
	SYSTEM_USERS("System Users"),
	GENERATE_REPORTS("Performance Reports"),
    MESSAGING("Messaging"),
    CURRICULUM_COVERAGE("Curriculum Coverage"),
	INCENTIVES("Incentives"),
	UTILITY_MANAGER("Utility Manager"),
	SUPERVISION("Supervision");

	private String menu;

	NavigationMenuDTO(String menu) {
		this.menu = menu;
	}

	public String getNavigationMenu() {
		return menu;
	}

	public void setNavigationMenu(String menu) {
		this.menu = menu;
	}

	public static NavigationMenuDTO getNavigationMenu(String menu) {
		for (NavigationMenuDTO navigationMenu : NavigationMenuDTO.values()) {
			if (navigationMenu.getNavigationMenu().equalsIgnoreCase(menu)) {
				return navigationMenu;
			}
		}
		return null;
	}
 

}
