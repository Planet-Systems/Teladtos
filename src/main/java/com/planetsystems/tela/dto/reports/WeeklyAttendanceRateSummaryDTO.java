package com.planetsystems.tela.dto.reports;

import java.io.Serializable;

public class WeeklyAttendanceRateSummaryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long mondaySchoolsClockedIn;
	private long mondayStaffClockedIn;
	private long mondayLearnerRecorded;

	private long tuesdaySchoolsClockedIn;
	private long tuesdayStaffClockedIn;
	private long tuesdayLearnerRecorded;

	private long wednesdaySchoolsClockedIn;
	private long wednesdayStaffClockedIn;
	private long wednesdayLearnerRecorded;

	private long thurdadySchoolsClockedIn;
	private long thurdadyStaffClockedIn;
	private long thurdadyLearnerRecorded;

	private long fridaySchoolsClockedIn;
	private long fridayStaffClockedIn;
	private long fridayLearnerRecorded;

	private String startDate;
	private String endDate;

	public WeeklyAttendanceRateSummaryDTO() {

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

	public long getMondayLearnerRecorded() {
		return mondayLearnerRecorded;
	}

	public void setMondayLearnerRecorded(long mondayLearnerRecorded) {
		this.mondayLearnerRecorded = mondayLearnerRecorded;
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

	public long getTuesdayLearnerRecorded() {
		return tuesdayLearnerRecorded;
	}

	public void setTuesdayLearnerRecorded(long tuesdayLearnerRecorded) {
		this.tuesdayLearnerRecorded = tuesdayLearnerRecorded;
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

	public long getWednesdayLearnerRecorded() {
		return wednesdayLearnerRecorded;
	}

	public void setWednesdayLearnerRecorded(long wednesdayLearnerRecorded) {
		this.wednesdayLearnerRecorded = wednesdayLearnerRecorded;
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

	public long getThurdadyLearnerRecorded() {
		return thurdadyLearnerRecorded;
	}

	public void setThurdadyLearnerRecorded(long thurdadyLearnerRecorded) {
		this.thurdadyLearnerRecorded = thurdadyLearnerRecorded;
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

	public long getFridayLearnerRecorded() {
		return fridayLearnerRecorded;
	}

	public void setFridayLearnerRecorded(long fridayLearnerRecorded) {
		this.fridayLearnerRecorded = fridayLearnerRecorded;
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

}
