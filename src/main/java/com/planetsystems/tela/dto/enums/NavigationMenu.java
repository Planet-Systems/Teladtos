package com.planetsystems.tela.dto.enums;

/**
 * contains side nav titles of the management app
 *
 * System user can be assigned one or more of these items depending on his/her authority
 * when assigned user gets access to the sub items, forming a persisted SystemUserSubMenu
 *
 * rename to SideNavTitle
 */
public enum NavigationMenu {

	SYSTEM_CONFIGURATION("System Configuration"),
	ENROLLMENT("Enrollment"),
	ATTENDANCE("Attendance"),
	TIMETABLE("TimeTable"),
	SYSTEM_USERS("System Users"),
	SUPERVISION("Supervision"),
	GENERATE_REPORTS("Supervision"),
	CURRICULUM_COVERAGE("Curriculum Coverage"),
	INCENTIVES("Incentives"),
	UTILITY_MANAGER("Utility Manager");
 
	private String menu;

	NavigationMenu(String menu) {
		this.menu = menu;
	}

	public String getNavigationMenu() {
		return menu;
	}

	public void setNavigationMenu(String menu) {
		this.menu = menu;
	}

	public static NavigationMenu getNavigationMenu(String menu) {
		for (NavigationMenu navigationMenu : NavigationMenu.values()) {
			if (navigationMenu.getNavigationMenu().equalsIgnoreCase(menu))
				return navigationMenu;
		}
		return null;
	}


}
