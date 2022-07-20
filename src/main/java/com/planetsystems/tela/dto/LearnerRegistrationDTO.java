package com.planetsystems.tela.dto;

import java.io.Serializable;
import java.util.List;

public class LearnerRegistrationDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private LearnerDetailDTO learnerDetailDTO;
	private String schoolId;
	private String schoolClassId;
	private String academicTermId;
	private String academicYearId;
	private String schoolDistrictId;
	private String admissionNo;

	List<LearnerGuardianDTO> guardians;

	public LearnerRegistrationDTO() {

	}

	public LearnerDetailDTO getLearnerDetailDTO() {
		return learnerDetailDTO;
	}

	public void setLearnerDetailDTO(LearnerDetailDTO learnerDetailDTO) {
		this.learnerDetailDTO = learnerDetailDTO;
	}

	public String getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolClassId() {
		return schoolClassId;
	}

	public void setSchoolClassId(String schoolClassId) {
		this.schoolClassId = schoolClassId;
	}

	public String getAcademicTermId() {
		return academicTermId;
	}

	public void setAcademicTermId(String academicTermId) {
		this.academicTermId = academicTermId;
	}

	public List<LearnerGuardianDTO> getGuardians() {
		return guardians;
	}

	public void setGuardians(List<LearnerGuardianDTO> guardians) {
		this.guardians = guardians;
	}

	public String getAcademicYearId() {
		return academicYearId;
	}

	public void setAcademicYearId(String academicYearId) {
		this.academicYearId = academicYearId;
	}

	public String getSchoolDistrictId() {
		return schoolDistrictId;
	}

	public void setSchoolDistrictId(String schoolDistrictId) {
		this.schoolDistrictId = schoolDistrictId;
	}

	public String getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(String admissionNo) {
		this.admissionNo = admissionNo;
	}

}
