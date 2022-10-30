package com.planetsystems.tela.dto;

public class SchoolDTO extends ParentDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private String name;

	private SchoolCategoryDTO schoolCategoryDTO;

	private String latitude;
	private String longitude;

	private DistrictDTO districtDTO;

	private String deviceNumber; // Phone Serial number

	private boolean attendanceTracked = true;

	private String activationStatus;

	private String schoolLevel;
	private String schoolOwnership;
	private String schoolType;
	private String schoolGenderCategory;
	private String licensed;

	private String rolloutPhase;

	private String telaSchoolNumber;

	private String emisNumber;
	private String telaSchoolUID;
	private String telaLicenseKey;

	public SchoolDTO() {
	}

	public SchoolDTO(String id) {
		super(id);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SchoolCategoryDTO getSchoolCategoryDTO() {
		return schoolCategoryDTO;
	}

	public void setSchoolCategoryDTO(SchoolCategoryDTO schoolCategoryDTO) {
		this.schoolCategoryDTO = schoolCategoryDTO;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public DistrictDTO getDistrictDTO() {
		return districtDTO;
	}

	public void setDistrictDTO(DistrictDTO districtDTO) {
		this.districtDTO = districtDTO;
	}

	public String getDeviceNumber() {
		return deviceNumber;
	}

	public void setDeviceNumber(String deviceNumber) {
		this.deviceNumber = deviceNumber;
	}

	public boolean isAttendanceTracked() {
		return attendanceTracked;
	}

	public void setAttendanceTracked(boolean attendanceTracked) {
		this.attendanceTracked = attendanceTracked;
	}

	public String getActivationStatus() {
		return activationStatus;
	}

	public void setActivationStatus(String activationStatus) {
		this.activationStatus = activationStatus;
	}

	@Override
	public String toString() {
		return "SchoolDTO{" + "code='" + code + '\'' + ", name='" + name + '\'' + ", schoolCategoryDTO="
				+ schoolCategoryDTO + ", latitude='" + latitude + '\'' + ", longitude='" + longitude + '\''
				+ ", districtDTO=" + districtDTO + ", deviceNumber='" + deviceNumber + '\'' + ", attendanceTracked="
				+ attendanceTracked + ", activationStatus='" + activationStatus + '\'' + '}';
	}

	public String getSchoolLevel() {
		return schoolLevel;
	}

	public void setSchoolLevel(String schoolLevel) {
		this.schoolLevel = schoolLevel;
	}

	public String getSchoolOwnership() {
		return schoolOwnership;
	}

	public void setSchoolOwnership(String schoolOwnership) {
		this.schoolOwnership = schoolOwnership;
	}

	public String getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public String getSchoolGenderCategory() {
		return schoolGenderCategory;
	}

	public void setSchoolGenderCategory(String schoolGenderCategory) {
		this.schoolGenderCategory = schoolGenderCategory;
	}

	public String getLicensed() {
		return licensed;
	}

	public void setLicensed(String licensed) {
		this.licensed = licensed;
	}

	public String getRolloutPhase() {
		return rolloutPhase;
	}

	public void setRolloutPhase(String rolloutPhase) {
		this.rolloutPhase = rolloutPhase;
	}

	public String getTelaSchoolNumber() {
		return telaSchoolNumber;
	}

	public void setTelaSchoolNumber(String telaSchoolNumber) {
		this.telaSchoolNumber = telaSchoolNumber;
	}

	public String getEmisNumber() {
		return emisNumber;
	}

	public void setEmisNumber(String emisNumber) {
		this.emisNumber = emisNumber;
	}

	public String getTelaSchoolUID() {
		return telaSchoolUID;
	}

	public void setTelaSchoolUID(String telaSchoolUID) {
		this.telaSchoolUID = telaSchoolUID;
	}

	public String getTelaLicenseKey() {
		return telaLicenseKey;
	}

	public void setTelaLicenseKey(String telaLicenseKey) {
		this.telaLicenseKey = telaLicenseKey;
	}

}
