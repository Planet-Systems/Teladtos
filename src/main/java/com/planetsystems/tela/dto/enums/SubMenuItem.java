package com.planetsystems.tela.dto.enums;

/**
 * contains the side nav sub items(links/name tokens)
 * when clicked associated presenter is loaded
 *
 *rename to SideNavItem
 */
public enum SubMenuItem {
	
	Dashboard("Dashboard"),
	AcademicYear("Assessment Periods"),
	Location("Locations"), 
	Schools("Schools"),
	Subjects("Subjects"),
	Staff_Attendance("Staff Attendance"),
	Learner_Attendance("Learner Attendance"),
	Head_Teacher_Supervision("Staff Daily Attendance SuperVision"),
	STAFF_DAILY_TIMETABLE_LESSONS("Staff Daily Timetable Lessons"),
	STAFF_DAILY_ATTENDANCE_SUPERVISION("Staff Daily Attendance Supervision"),
//	Staff_Daily_Task("Staff Daily Lessons"),
	Staff_Enrollement("Staff Enrollment"),
	Learner_Enrollement("Learner Enrollment"),
	TimeTable("TimeTable"),
	Users("System Users"),
	MESSAGING("Messaging");




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
