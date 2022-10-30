package com.planetsystems.tela.dto.reports;

import java.io.Serializable;

public class DataUploadStatDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String region;
	private String district;
	private String school;
	private String schoolTelephoneNo;
	private String level;
	private String schoolId;
	private String rolloutPhase;
	private boolean uploadedStaff;
	private boolean headTeacher;
	private long staff;
	private boolean timetable;
	
	
	public DataUploadStatDTO() {
		
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}


	public String getSchoolTelephoneNo() {
		return schoolTelephoneNo;
	}


	public void setSchoolTelephoneNo(String schoolTelephoneNo) {
		this.schoolTelephoneNo = schoolTelephoneNo;
	}


	public String getLevel() {
		return level;
	}


	public void setLevel(String level) {
		this.level = level;
	}


	public String getSchoolId() {
		return schoolId;
	}


	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}


	public String getRolloutPhase() {
		return rolloutPhase;
	}


	public void setRolloutPhase(String rolloutPhase) {
		this.rolloutPhase = rolloutPhase;
	}


	public boolean isUploadedStaff() {
		return uploadedStaff;
	}


	public void setUploadedStaff(boolean uploadedStaff) {
		this.uploadedStaff = uploadedStaff;
	}


	public boolean isHeadTeacher() {
		return headTeacher;
	}


	public void setHeadTeacher(boolean headTeacher) {
		this.headTeacher = headTeacher;
	}


	public long getStaff() {
		return staff;
	}


	public void setStaff(long staff) {
		this.staff = staff;
	}


	public boolean isTimetable() {
		return timetable;
	}


	public void setTimetable(boolean timetable) {
		this.timetable = timetable;
	}
	
	
	

}
