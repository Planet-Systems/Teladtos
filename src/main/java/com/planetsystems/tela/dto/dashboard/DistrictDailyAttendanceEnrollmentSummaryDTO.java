package com.planetsystems.tela.dto.dashboard;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DistrictDailyAttendanceEnrollmentSummaryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long enroledSchools;
	private long clockedSchools;
	private long clockedHeadteachers;
	private long enrolledTeachers;
	private long clockedInteachers;
	private long enroledLearners;
	private long clockedLearners;

	private List<DailyDistrictAttendanceEnrollmentSummaryDTO> dailyDistrictAttendanceEnrollmentSummaryDTOs;

	public DistrictDailyAttendanceEnrollmentSummaryDTO() {

	}

	public long getEnroledSchools() {
		return enroledSchools;
	}

	public void setEnroledSchools(long enroledSchools) {
		this.enroledSchools = enroledSchools;
	}

	public long getClockedSchools() {
		return clockedSchools;
	}

	public void setClockedSchools(long clockedSchools) {
		this.clockedSchools = clockedSchools;
	}

	public long getClockedHeadteachers() {
		return clockedHeadteachers;
	}

	public void setClockedHeadteachers(long clockedHeadteachers) {
		this.clockedHeadteachers = clockedHeadteachers;
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

	public List<DailyDistrictAttendanceEnrollmentSummaryDTO> getDailyDistrictAttendanceEnrollmentSummaryDTOs() {
		return dailyDistrictAttendanceEnrollmentSummaryDTOs;
	}

	public void setDailyDistrictAttendanceEnrollmentSummaryDTOs(
			List<DailyDistrictAttendanceEnrollmentSummaryDTO> dailyDistrictAttendanceEnrollmentSummaryDTOs) {
		this.dailyDistrictAttendanceEnrollmentSummaryDTOs = dailyDistrictAttendanceEnrollmentSummaryDTOs;
	}

}
