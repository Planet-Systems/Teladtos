package com.planetsystems.tela.dto.enums;
@Deprecated
public enum NavigationMenuDTO {
	 
	SYSTEM_CONFIGURATION("System Configuration"),
	ENROLLMENT("Enrollment"),
	ATTENDANCE("Attendance"),
	TIMETABLE("TimeTable"),
	SYSTEM_USERS("System Users"),
	GENERATE_REPORTS("Reports"),
	SUPERVISION("Supervision"),
	CURRICULUM_COVERAGE("Curriculum Coverage"),
	INCENTIVES("Incentives"),
	UTILITY_MANAGER("Utility Manager");


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
