package com.planetsystems.tela.dto.dashboard;

import java.io.Serializable;
import java.util.List;

public class DashboardSummaryDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long shools;
	private long teachers;
	private long learners;

	private long maleTeachers;
	private long femaleTeachers;

	private long boys;
	private long girls;

	private String year;
	private String term;

	private List<DataOutPutDTO> staffEnrolled;
	private List<DataOutPutDTO> learnsEnrolled;
	
	private List<DataOutPutByGenderDTO> staffEnrolledByGender;
	private List<DataOutPutByGenderDTO> learnsEnrolledByGender;

	public DashboardSummaryDTO() {

	}

	public long getShools() {
		return shools;
	}

	public void setShools(long shools) {
		this.shools = shools;
	}

	public long getTeachers() {
		return teachers;
	}

	public void setTeachers(long teachers) {
		this.teachers = teachers;
	}

	public long getLearners() {
		return learners;
	}

	public void setLearners(long learners) {
		this.learners = learners;
	}

	public long getMaleTeachers() {
		return maleTeachers;
	}

	public void setMaleTeachers(long maleTeachers) {
		this.maleTeachers = maleTeachers;
	}

	public long getFemaleTeachers() {
		return femaleTeachers;
	}

	public void setFemaleTeachers(long femaleTeachers) {
		this.femaleTeachers = femaleTeachers;
	}

	public long getBoys() {
		return boys;
	}

	public void setBoys(long boys) {
		this.boys = boys;
	}

	public long getGirls() {
		return girls;
	}

	public void setGirls(long girls) {
		this.girls = girls;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public List<DataOutPutDTO> getStaffEnrolled() {
		return staffEnrolled;
	}

	public void setStaffEnrolled(List<DataOutPutDTO> staffEnrolled) {
		this.staffEnrolled = staffEnrolled;
	}

	public List<DataOutPutDTO> getLearnsEnrolled() {
		return learnsEnrolled;
	}

	public void setLearnsEnrolled(List<DataOutPutDTO> learnsEnrolled) {
		this.learnsEnrolled = learnsEnrolled;
	}

	public List<DataOutPutByGenderDTO> getStaffEnrolledByGender() {
		return staffEnrolledByGender;
	}

	public void setStaffEnrolledByGender(List<DataOutPutByGenderDTO> staffEnrolledByGender) {
		this.staffEnrolledByGender = staffEnrolledByGender;
	}

	public List<DataOutPutByGenderDTO> getLearnsEnrolledByGender() {
		return learnsEnrolledByGender;
	}

	public void setLearnsEnrolledByGender(List<DataOutPutByGenderDTO> learnsEnrolledByGender) {
		this.learnsEnrolledByGender = learnsEnrolledByGender;
	}
	
	

}
