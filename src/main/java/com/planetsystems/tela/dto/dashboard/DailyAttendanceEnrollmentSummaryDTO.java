package com.planetsystems.tela.dto.dashboard;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyAttendanceEnrollmentSummaryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	private String districtId;
	private String district;
	private long enroledSchools;
	private long clockedSchools;
	private long enrolledTeachers;
	private long clockedInteachers;
	private long enroledLearners;
	private long clockedLearners;

	public DailyAttendanceEnrollmentSummaryDTO() {

	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
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

	public long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getDistrictId() {
		return districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

}
