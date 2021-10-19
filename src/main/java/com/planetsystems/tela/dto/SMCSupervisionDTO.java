package com.planetsystems.tela.dto;

public class SMCSupervisionDTO extends ParentDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private AcademicTermDTO academicTerm;
	private SchoolDTO school;
	private SchoolStaffDTO supervisor;

	private long staffPresent;
	private long staffAtWork;
	private String comment;

	private String submissionDate;

	private long staffAtWorkNotWorking;
	private long staffAtWorkWorking;
	private String supervisorStatus;

	private String status_p1;
	private String status_p2;
	private String status_p3;
	private String status_p4;
	private String status_p5;
	private String status_p6;
	private String status_p7;

	public SMCSupervisionDTO() {

	}

	public AcademicTermDTO getAcademicTerm() {
		return academicTerm;
	}

	public void setAcademicTerm(AcademicTermDTO academicTerm) {
		this.academicTerm = academicTerm;
	}

	public SchoolDTO getSchool() {
		return school;
	}

	public void setSchool(SchoolDTO school) {
		this.school = school;
	}

	public SchoolStaffDTO getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(SchoolStaffDTO supervisor) {
		this.supervisor = supervisor;
	}

	public long getStaffPresent() {
		return staffPresent;
	}

	public void setStaffPresent(long staffPresent) {
		this.staffPresent = staffPresent;
	}

	public long getStaffAtWork() {
		return staffAtWork;
	}

	public void setStaffAtWork(long staffAtWork) {
		this.staffAtWork = staffAtWork;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}

	public long getStaffAtWorkNotWorking() {
		return staffAtWorkNotWorking;
	}

	public void setStaffAtWorkNotWorking(long staffAtWorkNotWorking) {
		this.staffAtWorkNotWorking = staffAtWorkNotWorking;
	}

	public long getStaffAtWorkWorking() {
		return staffAtWorkWorking;
	}

	public void setStaffAtWorkWorking(long staffAtWorkWorking) {
		this.staffAtWorkWorking = staffAtWorkWorking;
	}

	public String getSupervisorStatus() {
		return supervisorStatus;
	}

	public void setSupervisorStatus(String supervisorStatus) {
		this.supervisorStatus = supervisorStatus;
	}

	public String getStatus_p1() {
		return status_p1;
	}

	public void setStatus_p1(String status_p1) {
		this.status_p1 = status_p1;
	}

	public String getStatus_p2() {
		return status_p2;
	}

	public void setStatus_p2(String status_p2) {
		this.status_p2 = status_p2;
	}

	public String getStatus_p3() {
		return status_p3;
	}

	public void setStatus_p3(String status_p3) {
		this.status_p3 = status_p3;
	}

	public String getStatus_p4() {
		return status_p4;
	}

	public void setStatus_p4(String status_p4) {
		this.status_p4 = status_p4;
	}

	public String getStatus_p5() {
		return status_p5;
	}

	public void setStatus_p5(String status_p5) {
		this.status_p5 = status_p5;
	}

	public String getStatus_p6() {
		return status_p6;
	}

	public void setStatus_p6(String status_p6) {
		this.status_p6 = status_p6;
	}

	public String getStatus_p7() {
		return status_p7;
	}

	public void setStatus_p7(String status_p7) {
		this.status_p7 = status_p7;
	}

}
