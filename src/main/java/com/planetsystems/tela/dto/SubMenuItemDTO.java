package com.planetsystems.tela.dto;

public enum SubMenuItemDTO {

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
	National_Reports("National Performance");

	private String menuItem;

	SubMenuItemDTO(String menuItem) {
		this.menuItem = menuItem;
	}

	public String getSystemMenuItem() {
		return menuItem;
	}

	public void setSystemMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}

	public static SubMenuItemDTO getSystemMenuItem(String menuItem) {
		for (SubMenuItemDTO systemMenuItem : SubMenuItemDTO.values()) {
			if (systemMenuItem.getSystemMenuItem().equalsIgnoreCase(menuItem)) {
				return systemMenuItem;
			}
		}
		return null;
	}

}
