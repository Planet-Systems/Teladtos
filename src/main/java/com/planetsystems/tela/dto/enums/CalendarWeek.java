package com.planetsystems.tela.dto.enums;

public enum CalendarWeek {

	WEEK1("Week 1"), WEEK2("Week 2"), WEEK3("Week 3"), WEEK4("Week 4"), WEEK5("Week 5");

	String week;

	CalendarWeek(String week) {
		this.week = week;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public static CalendarWeek getWeek(String week) {
		for (CalendarWeek schoolCalendarWeek : CalendarWeek.values()) {
			if (schoolCalendarWeek.getWeek().equalsIgnoreCase(week))
				return schoolCalendarWeek;
		}
		return null;
	}

}
