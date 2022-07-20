package com.planetsystems.tela.dto;

import java.util.List;

public class SchoolCalendarDTO extends ParentDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private AcademicTermDTO academicTerm;
	private int expectedDailyHours;
	private int expectedWeeklyHours;
	private int expectedMonthlyHours;
	private int expectedTermlyHours;
	private String description;

	private List<SchoolCalendarWeekDTO> schoolCalendarWeekDTOs;

	private List<PublicHolidayDTO> publicHolidayDTOs;

	public SchoolCalendarDTO() {

	}

	public AcademicTermDTO getAcademicTerm() {
		return academicTerm;
	}

	public void setAcademicTerm(AcademicTermDTO academicTerm) {
		this.academicTerm = academicTerm;
	}

	public int getExpectedDailyHours() {
		return expectedDailyHours;
	}

	public void setExpectedDailyHours(int expectedDailyHours) {
		this.expectedDailyHours = expectedDailyHours;
	}

	public int getExpectedWeeklyHours() {
		return expectedWeeklyHours;
	}

	public void setExpectedWeeklyHours(int expectedWeeklyHours) {
		this.expectedWeeklyHours = expectedWeeklyHours;
	}

	public int getExpectedMonthlyHours() {
		return expectedMonthlyHours;
	}

	public void setExpectedMonthlyHours(int expectedMonthlyHours) {
		this.expectedMonthlyHours = expectedMonthlyHours;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<SchoolCalendarWeekDTO> getSchoolCalendarWeekDTOs() {
		return schoolCalendarWeekDTOs;
	}

	public void setSchoolCalendarWeekDTOs(List<SchoolCalendarWeekDTO> schoolCalendarWeekDTOs) {
		this.schoolCalendarWeekDTOs = schoolCalendarWeekDTOs;
	}

	public List<PublicHolidayDTO> getPublicHolidayDTOs() {
		return publicHolidayDTOs;
	}

	public void setPublicHolidayDTOs(List<PublicHolidayDTO> publicHolidayDTOs) {
		this.publicHolidayDTOs = publicHolidayDTOs;
	}

	public int getExpectedTermlyHours() {
		return expectedTermlyHours;
	}

	public void setExpectedTermlyHours(int expectedTermlyHours) {
		this.expectedTermlyHours = expectedTermlyHours;
	}

}
