package com.planetsystems.tela.dto.dashboard;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SchoolDailyAttendanceEnrollmentSummaryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean headteacherClockInStatus;
	private long enrolledTeachers;
	private long clockedInteachers;
	private long enroledLearners;
	private long clockedLearners;
	private long girlsPresent;
	private long boysPresent;

	private List<DailySchoolAttendanceEnrollmentSummaryDTO> dailySchoolAttendanceEnrollmentSummaryDTOs;

	public SchoolDailyAttendanceEnrollmentSummaryDTO() {

	}

	public boolean isHeadteacherClockInStatus() {
		return headteacherClockInStatus;
	}

	public void setHeadteacherClockInStatus(boolean headteacherClockInStatus) {
		this.headteacherClockInStatus = headteacherClockInStatus;
	}

	public long getEnrolledTeachers() {
		return enrolledTeachers;
	}

	public void setEnrolledTeachers(long enrolledTeachers) {
		this.enrolledTeachers = enrolledTeachers;
	}

	public long getClockedInteachers() {
		return clockedInteachers;
	}

	public void setClockedInteachers(long clockedInteachers) {
		this.clockedInteachers = clockedInteachers;
	}

	public long getEnroledLearners() {
		return enroledLearners;
	}

	public void setEnroledLearners(long enroledLearners) {
		this.enroledLearners = enroledLearners;
	}

	public long getClockedLearners() {
		return clockedLearners;
	}

	public void setClockedLearners(long clockedLearners) {
		this.clockedLearners = clockedLearners;
	}

	public List<DailySchoolAttendanceEnrollmentSummaryDTO> getDailySchoolAttendanceEnrollmentSummaryDTOs() {
		return dailySchoolAttendanceEnrollmentSummaryDTOs;
	}

	public void setDailySchoolAttendanceEnrollmentSummaryDTOs(
			List<DailySchoolAttendanceEnrollmentSummaryDTO> dailySchoolAttendanceEnrollmentSummaryDTOs) {
		this.dailySchoolAttendanceEnrollmentSummaryDTOs = dailySchoolAttendanceEnrollmentSummaryDTOs;
	}

	public long getGirlsPresent() {
		return girlsPresent;
	}

	public void setGirlsPresent(long girlsPresent) {
		this.girlsPresent = girlsPresent;
	}

	public long getBoysPresent() {
		return boysPresent;
	}

	public void setBoysPresent(long boysPresent) {
		this.boysPresent = boysPresent;
	}

}
