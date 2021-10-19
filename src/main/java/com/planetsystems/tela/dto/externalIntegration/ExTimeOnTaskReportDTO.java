package com.planetsystems.tela.dto.externalIntegration;

import java.io.Serializable;

public class ExTimeOnTaskReportDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String staffName;
	private String staffCode;
	private String attendanceDay;
	private String attendanceDate;
	private String schoolClass;

	private String Subject;
	private String startTime;
	private String endTime;

	private String teachingStatus;
	private String teachingTimeStatus;

	private String comment;

	public ExTimeOnTaskReportDTO() {

	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	public String getAttendanceDay() {
		return attendanceDay;
	}

	public void setAttendanceDay(String attendanceDay) {
		this.attendanceDay = attendanceDay;
	}

	public String getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(String attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	public String getSchoolClass() {
		return schoolClass;
	}

	public void setSchoolClass(String schoolClass) {
		this.schoolClass = schoolClass;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getTeachingStatus() {
		return teachingStatus;
	}

	public void setTeachingStatus(String teachingStatus) {
		this.teachingStatus = teachingStatus;
	}

	public String getTeachingTimeStatus() {
		return teachingTimeStatus;
	}

	public void setTeachingTimeStatus(String teachingTimeStatus) {
		this.teachingTimeStatus = teachingTimeStatus;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
