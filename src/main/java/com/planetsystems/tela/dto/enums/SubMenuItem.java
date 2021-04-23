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
	Staff_Attendance("Staff Attendance"),
	Learner_Attendance("Learner Attendance"),
	Head_Teacher_Supervision("Staff Daily Attendance SuperVision"),
	Staff_Daily_Task("Staff Daily Lessons"),
	Staff_Enrollement("Staff Enrollment"),
	Learner_Enrollement("Learner Enrollment"),
	TimeTable("TimeTable"),
	Users("System Users"),
	School_Performace("School Performance"),
	District_Reports("District Performance"),
	National_Reports("National Performance"),
	STAFF_DAILY_TIMETABLE_LESSONS("Staff Daily Timetable Lessons");


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
