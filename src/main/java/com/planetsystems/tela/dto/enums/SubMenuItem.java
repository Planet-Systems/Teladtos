package com.planetsystems.tela.dto.enums;

/**
 * contains the side nav sub items(links/name tokens)
 * when clicked associated presenter is loaded
 *
 * Must be same as NameTokens
 *
 *rename to SideNavItem
 */

public enum SubMenuItem {

	/*
		public static final String devicemanager = "Device Manager";

	public static final String SmsSystemUser = "SmsSystemUser";

	public static final String SmsStaff = "SmsStaff";

	public static final String SMSMESSAGING = "SMS Manager";

	public static final String ProfileDetail = "ProfileDetail";

	public static final String Reports = "Reports";

	public static final String nationalperformace = "National Performance";

	public static final String districtperformance = "District Performance";

	public static final String schoolperformance = "School Performance";

	public static final String TimeAttendanceSupervision = "TimeAttendanceSupervision";

	public static final String StaffDailyAttendanceSuperVision = "Staff Daily Attendance Supervision";

	public static final String login = "Login";
	public static final String authentication = "Authentication";

	public static final String schoolClassCategory = "Schools";
	public static final String subjectCategory = "Subjects";



	public static final String staffAttendance = "Staff Attendance";
	public static final String learnerAttendance = "Learner Attendance";

	public static final String StaffDailyTask = "Staff Daily Timetable Lessons";

	public static final String timeTable = "TimeTables";

	public static final String SystemUser = "System Users";
	 */

	DASHBOARD("Dashboard"),
	ASSESSMENT_PERIOD("Assessment Periods"),
	LOCATION("Locations"),
	SCHOOL_CLASS_CATEGORY("Schools"),
	SUBJECTS("Subjects"),

	LEARNER_ENROLLMENT("Learner Enrollment"),
	STAFF_ENROLLMENT("Staff Enrollment"),

	STAFF_ATTENDANCE("Staff Attendance"),
	LEARNER_ATTENDANCE("Learner Attendance"),
	STAFF_DAILY_TIMETABLE_LESSONS("Staff Daily Timetable Lessons"),
	STAFF_DAILY_ATTENDANCE_SUPERVISION("Staff Daily Attendance Supervision"),

	TIMETABLE("TimeTables"),

	SYSTEM_USERS("System Users"),

	SCHOOL_PERFORMANCE("School Performance"),
	DISTRICT_PERFORMANCE("District Performance"),
	NATIONAL_PERFORMANCE("National Performance"),

	DEVICE_MANAGER("Device Manager"),
	SMS_SYSTEM_USER("SmsSystemUser"),
	SMS_STAFF ("SmsStaff"),
	SMS_MANAGER("SMS Manager");





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
