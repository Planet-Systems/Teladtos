package com.planetsystems.tela.dto;
 

public class SchoolCalendarWeekDTO extends ParentDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String calendarMonth;
	private String calendarWeek;
	private String startDate;
	private String endDate;
	private int expectedHours;
	
	public SchoolCalendarWeekDTO() {
		
	}

	public String getCalendarMonth() {
		return calendarMonth;
	}

	public void setCalendarMonth(String calendarMonth) {
		this.calendarMonth = calendarMonth;
	}

	public String getCalendarWeek() {
		return calendarWeek;
	}

	public void setCalendarWeek(String calendarWeek) {
		this.calendarWeek = calendarWeek;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getExpectedHours() {
		return expectedHours;
	}

	public void setExpectedHours(int expectedHours) {
		this.expectedHours = expectedHours;
	}
	
	
}
