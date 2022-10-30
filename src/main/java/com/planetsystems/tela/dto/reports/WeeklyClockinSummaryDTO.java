package com.planetsystems.tela.dto.reports;

import java.io.Serializable;

public class WeeklyClockinSummaryDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String districtId;
	private String district;
	private long schoolsEnrolled;
	private long staffEnrolled;

	private long mondaySchoolsClockedIn;
	private long mondayStaffClockedIn;

	private long tuesdaySchoolsClockedIn;
	private long tuesdayStaffClockedIn;

	private long wednesdaySchoolsClockedIn;
	private long wednesdayStaffClockedIn;

	private long thurdadySchoolsClockedIn;
	private long thurdadyStaffClockedIn;

	private long fridaySchoolsClockedIn;
	private long fridayStaffClockedIn;

	public WeeklyClockinSummaryDTO() {

	}

	public String getDistrictId() {
		return districtId;
	}

	public void setDistrictId(String districtId) {
		this.districtId = districtId;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public long getSchoolsEnrolled() {
		return schoolsEnrolled;
	}

	public void setSchoolsEnrolled(long schoolsEnrolled) {
		this.schoolsEnrolled = schoolsEnrolled;
	}

	public long getStaffEnrolled() {
		return staffEnrolled;
	}

	public void setStaffEnrolled(long staffEnrolled) {
		this.staffEnrolled = staffEnrolled;
	}

	public long getMondaySchoolsClockedIn() {
		return mondaySchoolsClockedIn;
	}

	public void setMondaySchoolsClockedIn(long mondaySchoolsClockedIn) {
		this.mondaySchoolsClockedIn = mondaySchoolsClockedIn;
	}

	public long getMondayStaffClockedIn() {
		return mondayStaffClockedIn;
	}

	public void setMondayStaffClockedIn(long mondayStaffClockedIn) {
		this.mondayStaffClockedIn = mondayStaffClockedIn;
	}

	public long getTuesdaySchoolsClockedIn() {
		return tuesdaySchoolsClockedIn;
	}

	public void setTuesdaySchoolsClockedIn(long tuesdaySchoolsClockedIn) {
		this.tuesdaySchoolsClockedIn = tuesdaySchoolsClockedIn;
	}

	public long getTuesdayStaffClockedIn() {
		return tuesdayStaffClockedIn;
	}

	public void setTuesdayStaffClockedIn(long tuesdayStaffClockedIn) {
		this.tuesdayStaffClockedIn = tuesdayStaffClockedIn;
	}

	public long getWednesdaySchoolsClockedIn() {
		return wednesdaySchoolsClockedIn;
	}

	public void setWednesdaySchoolsClockedIn(long wednesdaySchoolsClockedIn) {
		this.wednesdaySchoolsClockedIn = wednesdaySchoolsClockedIn;
	}

	public long getWednesdayStaffClockedIn() {
		return wednesdayStaffClockedIn;
	}

	public void setWednesdayStaffClockedIn(long wednesdayStaffClockedIn) {
		this.wednesdayStaffClockedIn = wednesdayStaffClockedIn;
	}

	public long getThurdadySchoolsClockedIn() {
		return thurdadySchoolsClockedIn;
	}

	public void setThurdadySchoolsClockedIn(long thurdadySchoolsClockedIn) {
		this.thurdadySchoolsClockedIn = thurdadySchoolsClockedIn;
	}

	public long getThurdadyStaffClockedIn() {
		return thurdadyStaffClockedIn;
	}

	public void setThurdadyStaffClockedIn(long thurdadyStaffClockedIn) {
		this.thurdadyStaffClockedIn = thurdadyStaffClockedIn;
	}

	public long getFridaySchoolsClockedIn() {
		return fridaySchoolsClockedIn;
	}

	public void setFridaySchoolsClockedIn(long fridaySchoolsClockedIn) {
		this.fridaySchoolsClockedIn = fridaySchoolsClockedIn;
	}

	public long getFridayStaffClockedIn() {
		return fridayStaffClockedIn;
	}

	public void setFridayStaffClockedIn(long fridayStaffClockedIn) {
		this.fridayStaffClockedIn = fridayStaffClockedIn;
	}

}
