package com.planetsystems.tela.dto.reports;

import java.io.Serializable;

public class DataUploadStatSummaryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String region;
	private String districtId;
	private String district;
	private long primarySchoolsEnrolled;
	private long secondarySchoolsEnrolled;
	private long CAISchoolsEnrolled;

	private long primarySchoolsStaffUpload;
	private long SecondarySchoolsStaffUpload;
	private long CAISchoolsStaffUpload;
	
	private long nationalRolloutStaffSubmissions;
	private long nationalRolloutTimetableSubmissions;
	
	private long totalStaffSubmissions;
	private long totalTimetableSubmissions;
	 

	public DataUploadStatSummaryDTO() {

	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
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

	public long getPrimarySchoolsEnrolled() {
		return primarySchoolsEnrolled;
	}

	public void setPrimarySchoolsEnrolled(long primarySchoolsEnrolled) {
		this.primarySchoolsEnrolled = primarySchoolsEnrolled;
	}

	public long getSecondarySchoolsEnrolled() {
		return secondarySchoolsEnrolled;
	}

	public void setSecondarySchoolsEnrolled(long secondarySchoolsEnrolled) {
		this.secondarySchoolsEnrolled = secondarySchoolsEnrolled;
	}

	public long getCAISchoolsEnrolled() {
		return CAISchoolsEnrolled;
	}

	public void setCAISchoolsEnrolled(long cAISchoolsEnrolled) {
		CAISchoolsEnrolled = cAISchoolsEnrolled;
	}

	public long getPrimarySchoolsStaffUpload() {
		return primarySchoolsStaffUpload;
	}

	public void setPrimarySchoolsStaffUpload(long primarySchoolsStaffUpload) {
		this.primarySchoolsStaffUpload = primarySchoolsStaffUpload;
	}

	public long getSecondarySchoolsStaffUpload() {
		return SecondarySchoolsStaffUpload;
	}

	public void setSecondarySchoolsStaffUpload(long secondarySchoolsStaffUpload) {
		SecondarySchoolsStaffUpload = secondarySchoolsStaffUpload;
	}

	public long getCAISchoolsStaffUpload() {
		return CAISchoolsStaffUpload;
	}

	public void setCAISchoolsStaffUpload(long cAISchoolsStaffUpload) {
		CAISchoolsStaffUpload = cAISchoolsStaffUpload;
	}

	public long getNationalRolloutStaffSubmissions() {
		return nationalRolloutStaffSubmissions;
	}

	public void setNationalRolloutStaffSubmissions(long nationalRolloutStaffSubmissions) {
		this.nationalRolloutStaffSubmissions = nationalRolloutStaffSubmissions;
	}

	public long getNationalRolloutTimetableSubmissions() {
		return nationalRolloutTimetableSubmissions;
	}

	public void setNationalRolloutTimetableSubmissions(long nationalRolloutTimetableSubmissions) {
		this.nationalRolloutTimetableSubmissions = nationalRolloutTimetableSubmissions;
	}

	public long getTotalStaffSubmissions() {
		return totalStaffSubmissions;
	}

	public void setTotalStaffSubmissions(long totalStaffSubmissions) {
		this.totalStaffSubmissions = totalStaffSubmissions;
	}

	public long getTotalTimetableSubmissions() {
		return totalTimetableSubmissions;
	}

	public void setTotalTimetableSubmissions(long totalTimetableSubmissions) {
		this.totalTimetableSubmissions = totalTimetableSubmissions;
	}
	 

}
