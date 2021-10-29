package com.planetsystems.tela.dto.enums;

public enum SubMenuItemDTO {

	Dashboard("Overall Performance Dashboard"),
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
	SMC_Reports("SMC Performance"),
	User_Account_Requests("User Account Requests"),
	Daily_Attendace_Dashboard("Daily Attendance Dashboard");

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
