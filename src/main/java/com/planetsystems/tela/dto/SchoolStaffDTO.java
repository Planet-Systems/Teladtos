package com.planetsystems.tela.dto;

public class SchoolStaffDTO extends ParentDTO {
	private String staffCode;
	private String staffType;
	private boolean registered;

	private GeneralUserDetailDTO generalUserDetailDTO;
	private SchoolDTO schoolDTO;

	private String registrationNo;
	private String nationality;
	private boolean teachingstaff;

	public SchoolStaffDTO() {
	}

	public SchoolStaffDTO(String id) {
		super(id);
	}

	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	public String getStaffType() {
		return staffType;
	}

	public void setStaffType(String staffType) {
		this.staffType = staffType;
	}

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

	public GeneralUserDetailDTO getGeneralUserDetailDTO() {
		return generalUserDetailDTO;
	}

	public void setGeneralUserDetailDTO(GeneralUserDetailDTO generalUserDetailDTO) {
		this.generalUserDetailDTO = generalUserDetailDTO;
	}

	public SchoolDTO getSchoolDTO() {
		return schoolDTO;
	}

	public void setSchoolDTO(SchoolDTO schoolDTO) {
		this.schoolDTO = schoolDTO;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public boolean isTeachingstaff() {
		return teachingstaff;
	}

	public void setTeachingstaff(boolean teachingstaff) {
		this.teachingstaff = teachingstaff;
	}

	@Override
	public String toString() {
		return "SchoolStaffDTO{" + ", staffCode='" + staffCode + '\'' + ", staffType='" + staffType + '\''
				+ ", registered=" + registered + ", generalUserDetailDTO=" + generalUserDetailDTO + ", schoolDTO="
				+ schoolDTO + '}';
	}
}
