package com.planetsystems.tela.dto.enums;

/**
 * contains the side nav sub items(links/name tokens)
 * when clicked associated presenter is loaded
 *
 *rename to SideNavItem
 */
@Deprecated
public enum SubMenuItem {

	Dashboard("Dashboard"),
	AcademicYear("Assessment Periods"),
	Location("Locations"),
	Schools("Schools"),
	Subjects("Subjects"),
	Staff_Attendance("Teacher Attendance"),
	Learner_Attendance("Learner Attendance"),
	Head_Teacher_Supervision("Time Attendance"),
	Staff_Daily_Task("Task Attendance"),
	Staff_Enrollement("Teacher Enrollment"),
	Learner_Enrollement("Learner Enrollment"),
	TimeTable("TimeTables"),
	Users("System Users"),
	School_Performace("School Performance"),
	District_Reports("District Performance"),
	National_Reports("National Performance"),
	HT_Reports("HeadTeacher Performance"),
	SMC_Supervision("SMC Supervision"),
	SMC_Reports("SMC Performance");


	private String menuItem;

	SubMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}

	public String getSystemMenuItem() {
		return menuItem;
	}

	public void setSystemMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}

	public static SubMenuItem getSystemMenuItem(String menuItem) {
		for (SubMenuItem systemMenuItem : SubMenuItem.values()) {
			if (systemMenuItem.getSystemMenuItem().equalsIgnoreCase(menuItem)) {
				return systemMenuItem;
			}
		}
		return null;
	}


  
}
