package com.planetsystems.tela.dto.dashboard;

import java.io.Serializable;
import java.util.List;

public class AttendanceDashboardSummaryDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double teacher;
	private double learner;
	private double boys;
	private double girls;
	private double male;
	private double female;
	private String period;

	private List<DataOutPutDTO> staffAttendance;
	private List<DataOutPutDTO> learnAttendace;

	private List<DataOutPutByGenderDTO> staffAttendanceByGender;
	private List<DataOutPutByGenderDTO> learnAttendanceByGender;

	public AttendanceDashboardSummaryDTO() {

	}

	public double getTeacher() {
		return teacher;
	}

	public void setTeacher(double teacher) {
		this.teacher = teacher;
	}

	public double getLearner() {
		return learner;
	}

	public void setLearner(double learner) {
		this.learner = learner;
	}

	public double getBoys() {
		return boys;
	}

	public void setBoys(double boys) {
		this.boys = boys;
	}

	public double getGirls() {
		return girls;
	}

	public void setGirls(double girls) {
		this.girls = girls;
	}

	public double getMale() {
		return male;
	}

	public void setMale(double male) {
		this.male = male;
	}

	public double getFemale() {
		return female;
	}

	public void setFemale(double female) {
		this.female = female;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public List<DataOutPutDTO> getStaffAttendance() {
		return staffAttendance;
	}

	public void setStaffAttendance(List<DataOutPutDTO> staffAttendance) {
		this.staffAttendance = staffAttendance;
	}

	public List<DataOutPutDTO> getLearnAttendace() {
		return learnAttendace;
	}

	public void setLearnAttendace(List<DataOutPutDTO> learnAttendace) {
		this.learnAttendace = learnAttendace;
	}

	public List<DataOutPutByGenderDTO> getStaffAttendanceByGender() {
		return staffAttendanceByGender;
	}

	public void setStaffAttendanceByGender(List<DataOutPutByGenderDTO> staffAttendanceByGender) {
		this.staffAttendanceByGender = staffAttendanceByGender;
	}

	public List<DataOutPutByGenderDTO> getLearnAttendanceByGender() {
		return learnAttendanceByGender;
	}

	public void setLearnAttendanceByGender(List<DataOutPutByGenderDTO> learnAttendanceByGender) {
		this.learnAttendanceByGender = learnAttendanceByGender;
	}

}
