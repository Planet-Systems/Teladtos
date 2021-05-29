package com.planetsystems.tela.dto.AppDTO;

import java.io.Serializable;

public class SyncSMC implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String schoolId; // deploymentSiteId
	private String smcCode;
	private long staffPresent;
	private long staffTeaching;
	private long staffNotTeaching;
	private String p1;
	private String p2;
	private String p3;
	private String p4;
	private String p5;
	private String p6;
	private String p7;
	private String headTeacherPresent;

	private String visitDate;
	private String comment;

	private String id;
	private String dateCreated;
	private String dateUpdated;
	private String status;

	public SyncSMC() {

	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSmcCode() {
		return smcCode;
	}

	public void setSmcCode(String smcCode) {
		this.smcCode = smcCode;
	}

	public long getStaffPresent() {
		return staffPresent;
	}

	public void setStaffPresent(long staffPresent) {
		this.staffPresent = staffPresent;
	}

	public long getStaffTeaching() {
		return staffTeaching;
	}

	public void setStaffTeaching(long staffTeaching) {
		this.staffTeaching = staffTeaching;
	}

	public long getStaffNotTeaching() {
		return staffNotTeaching;
	}

	public void setStaffNotTeaching(long staffNotTeaching) {
		this.staffNotTeaching = staffNotTeaching;
	}

	public String getP1() {
		return p1;
	}

	public void setP1(String p1) {
		this.p1 = p1;
	}

	public String getP2() {
		return p2;
	}

	public void setP2(String p2) {
		this.p2 = p2;
	}

	public String getP3() {
		return p3;
	}

	public void setP3(String p3) {
		this.p3 = p3;
	}

	public String getP4() {
		return p4;
	}

	public void setP4(String p4) {
		this.p4 = p4;
	}

	public String getP5() {
		return p5;
	}

	public void setP5(String p5) {
		this.p5 = p5;
	}

	public String getP6() {
		return p6;
	}

	public void setP6(String p6) {
		this.p6 = p6;
	}

	public String getP7() {
		return p7;
	}

	public void setP7(String p7) {
		this.p7 = p7;
	}

	public String getHeadTeacherPresent() {
		return headTeacherPresent;
	}

	public void setHeadTeacherPresent(String headTeacherPresent) {
		this.headTeacherPresent = headTeacherPresent;
	}

	public String getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
