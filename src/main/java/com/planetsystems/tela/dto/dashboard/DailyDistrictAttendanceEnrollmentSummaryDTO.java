package com.planetsystems.tela.dto.dashboard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyDistrictAttendanceEnrollmentSummaryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String schoolId;
	private String school;
	private boolean headteacherStatus = false;
	private long enrolledTeachers;
	private long clockedInteachers;
	private long enroledLearners;
	private long clockedLearners;

	public DailyDistrictAttendanceEnrollmentSummaryDTO() {

	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public boolean isHeadteacherStatus() {
		return headteacherStatus;
	}

	public void setHeadteacherStatus(boolean headteacherStatus) {
		this.headteacherStatus = headteacherStatus;
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

}
