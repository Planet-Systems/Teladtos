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

	private long primarySchools;
	private long secondarySchools;
	private long institutions;

	private long specialNeedslearners;

	private long teachersOnPayRoll;
	private long teachersNotOnPayRoll;

	private long primaryLearners;
	private long primaryLearnersBoys;
	private long primaryLearnersGirls;

	private long primaryTeachers;
	private long primaryTeachersOnPayRoll;
	private long primaryTeachersNotOnPayRoll;
	private long primaryTeachersMale;
	private long primaryTeachersFemale;

	private long primaryLearnersWithSpecialNeedsMale;
	private long primaryLearnersWithSpecialNeedsFemale;

	private long institutionLearners;
	private long institutionLearnersBoys;
	private long institutionLearnersGirls;

	private long institutionTeachers;
	private long institutionTeachersOnPayRoll;
	private long institutionTeachersNotOnPayRoll;
	private long institutionTeachersMale;
	private long institutionTeachersFemale;

	private long institutionLearnersWithSpecialNeedsMale;
	private long institutionLearnersWithSpecialNeedsFemale;

	private long secondaryLearners;
	private long secondaryLearnersBoys;
	private long secondaryLearnersGirls;

	private long secondaryTeachers;
	private long secondaryTeachersOnPayRoll;
	private long secondaryTeachersNotOnPayRoll;
	private long secondaryTeachersMale;
	private long secondaryTeachersFemale;

	private long secondaryLearnersWithSpecialNeedsMale;
	private long secondaryLearnersWithSpecialNeedsFemale;

	private List<DataOutPutBySchoolLevelDTO> schoolsLevelByRegion;

	private List<DataOutPutDTO> primarystaffEnrolledByRegion;
	private List<DataOutPutByGenderDTO> primaryStaffEnrolledByGenderByRegion;

	private List<DataOutPutDTO> primarylearnsEnrolledByRegion;
	private List<DataOutPutByGenderDTO> primarylearnersEnrolledByGenderRegion;

	private List<DataOutPutDTO> secondarystaffEnrolledByRegion;
	private List<DataOutPutByGenderDTO> secondaryStaffEnrolledByGenderByRegion;

	private List<DataOutPutDTO> secondarylearnsEnrolledByRegion;
	private List<DataOutPutByGenderDTO> secondarylearnersEnrolledByGenderRegion;

	private List<DataOutPutDTO> institutionstaffEnrolledByRegion;
	private List<DataOutPutByGenderDTO> institutionStaffEnrolledByGenderByRegion;

	private List<DataOutPutDTO> institutionlearnsEnrolledByRegion;
	private List<DataOutPutByGenderDTO> institutionlearnersEnrolledByGenderRegion;

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

	public long getPrimarySchools() {
		return primarySchools;
	}

	public void setPrimarySchools(long primarySchools) {
		this.primarySchools = primarySchools;
	}

	public long getSecondarySchools() {
		return secondarySchools;
	}

	public void setSecondarySchools(long secondarySchools) {
		this.secondarySchools = secondarySchools;
	}

	public long getInstitutions() {
		return institutions;
	}

	public void setInstitutions(long institutions) {
		this.institutions = institutions;
	}

	public long getPrimaryTeachers() {
		return primaryTeachers;
	}

	public void setPrimaryTeachers(long primaryTeachers) {
		this.primaryTeachers = primaryTeachers;
	}

	public long getSecondaryTeachers() {
		return secondaryTeachers;
	}

	public void setSecondaryTeachers(long secondaryTeachers) {
		this.secondaryTeachers = secondaryTeachers;
	}

	public long getInstitutionTeachers() {
		return institutionTeachers;
	}

	public void setInstitutionTeachers(long institutionTeachers) {
		this.institutionTeachers = institutionTeachers;
	}

	public long getPrimaryLearners() {
		return primaryLearners;
	}

	public void setPrimaryLearners(long primaryLearners) {
		this.primaryLearners = primaryLearners;
	}

	public long getSecondaryLearners() {
		return secondaryLearners;
	}

	public void setSecondaryLearners(long secondaryLearners) {
		this.secondaryLearners = secondaryLearners;
	}

	public long getInstitutionLearners() {
		return institutionLearners;
	}

	public void setInstitutionLearners(long institutionLearners) {
		this.institutionLearners = institutionLearners;
	}

	public long getSpecialNeedslearners() {
		return specialNeedslearners;
	}

	public void setSpecialNeedslearners(long specialNeedslearners) {
		this.specialNeedslearners = specialNeedslearners;
	}

	public long getTeachersOnPayRoll() {
		return teachersOnPayRoll;
	}

	public void setTeachersOnPayRoll(long teachersOnPayRoll) {
		this.teachersOnPayRoll = teachersOnPayRoll;
	}

	public long getTeachersNotOnPayRoll() {
		return teachersNotOnPayRoll;
	}

	public void setTeachersNotOnPayRoll(long teachersNotOnPayRoll) {
		this.teachersNotOnPayRoll = teachersNotOnPayRoll;
	}

	public List<DataOutPutBySchoolLevelDTO> getSchoolsLevelByRegion() {
		return schoolsLevelByRegion;
	}

	public void setSchoolsLevelByRegion(List<DataOutPutBySchoolLevelDTO> schoolsLevelByRegion) {
		this.schoolsLevelByRegion = schoolsLevelByRegion;
	}

	public long getPrimaryLearnersBoys() {
		return primaryLearnersBoys;
	}

	public void setPrimaryLearnersBoys(long primaryLearnersBoys) {
		this.primaryLearnersBoys = primaryLearnersBoys;
	}

	public long getPrimaryLearnersGirls() {
		return primaryLearnersGirls;
	}

	public void setPrimaryLearnersGirls(long primaryLearnersGirls) {
		this.primaryLearnersGirls = primaryLearnersGirls;
	}

	public long getPrimaryTeachersOnPayRoll() {
		return primaryTeachersOnPayRoll;
	}

	public void setPrimaryTeachersOnPayRoll(long primaryTeachersOnPayRoll) {
		this.primaryTeachersOnPayRoll = primaryTeachersOnPayRoll;
	}

	public long getPrimaryTeachersNotOnPayRoll() {
		return primaryTeachersNotOnPayRoll;
	}

	public void setPrimaryTeachersNotOnPayRoll(long primaryTeachersNotOnPayRoll) {
		this.primaryTeachersNotOnPayRoll = primaryTeachersNotOnPayRoll;
	}

	public long getPrimaryTeachersMale() {
		return primaryTeachersMale;
	}

	public void setPrimaryTeachersMale(long primaryTeachersMale) {
		this.primaryTeachersMale = primaryTeachersMale;
	}

	public long getPrimaryTeachersFemale() {
		return primaryTeachersFemale;
	}

	public void setPrimaryTeachersFemale(long primaryTeachersFemale) {
		this.primaryTeachersFemale = primaryTeachersFemale;
	}

	public long getInstitutionLearnersBoys() {
		return institutionLearnersBoys;
	}

	public void setInstitutionLearnersBoys(long institutionLearnersBoys) {
		this.institutionLearnersBoys = institutionLearnersBoys;
	}

	public long getInstitutionLearnersGirls() {
		return institutionLearnersGirls;
	}

	public void setInstitutionLearnersGirls(long institutionLearnersGirls) {
		this.institutionLearnersGirls = institutionLearnersGirls;
	}

	public long getInstitutionTeachersOnPayRoll() {
		return institutionTeachersOnPayRoll;
	}

	public void setInstitutionTeachersOnPayRoll(long institutionTeachersOnPayRoll) {
		this.institutionTeachersOnPayRoll = institutionTeachersOnPayRoll;
	}

	public long getInstitutionTeachersNotOnPayRoll() {
		return institutionTeachersNotOnPayRoll;
	}

	public void setInstitutionTeachersNotOnPayRoll(long institutionTeachersNotOnPayRoll) {
		this.institutionTeachersNotOnPayRoll = institutionTeachersNotOnPayRoll;
	}

	public long getInstitutionTeachersMale() {
		return institutionTeachersMale;
	}

	public void setInstitutionTeachersMale(long institutionTeachersMale) {
		this.institutionTeachersMale = institutionTeachersMale;
	}

	public long getInstitutionTeachersFemale() {
		return institutionTeachersFemale;
	}

	public void setInstitutionTeachersFemale(long institutionTeachersFemale) {
		this.institutionTeachersFemale = institutionTeachersFemale;
	}

	public long getSecondaryLearnersBoys() {
		return secondaryLearnersBoys;
	}

	public void setSecondaryLearnersBoys(long secondaryLearnersBoys) {
		this.secondaryLearnersBoys = secondaryLearnersBoys;
	}

	public long getSecondaryLearnersGirls() {
		return secondaryLearnersGirls;
	}

	public void setSecondaryLearnersGirls(long secondaryLearnersGirls) {
		this.secondaryLearnersGirls = secondaryLearnersGirls;
	}

	public long getSecondaryTeachersOnPayRoll() {
		return secondaryTeachersOnPayRoll;
	}

	public void setSecondaryTeachersOnPayRoll(long secondaryTeachersOnPayRoll) {
		this.secondaryTeachersOnPayRoll = secondaryTeachersOnPayRoll;
	}

	public long getSecondaryTeachersNotOnPayRoll() {
		return secondaryTeachersNotOnPayRoll;
	}

	public void setSecondaryTeachersNotOnPayRoll(long secondaryTeachersNotOnPayRoll) {
		this.secondaryTeachersNotOnPayRoll = secondaryTeachersNotOnPayRoll;
	}

	public long getSecondaryTeachersMale() {
		return secondaryTeachersMale;
	}

	public void setSecondaryTeachersMale(long secondaryTeachersMale) {
		this.secondaryTeachersMale = secondaryTeachersMale;
	}

	public long getSecondaryTeachersFemale() {
		return secondaryTeachersFemale;
	}

	public void setSecondaryTeachersFemale(long secondaryTeachersFemale) {
		this.secondaryTeachersFemale = secondaryTeachersFemale;
	}

	public List<DataOutPutDTO> getPrimarystaffEnrolledByRegion() {
		return primarystaffEnrolledByRegion;
	}

	public void setPrimarystaffEnrolledByRegion(List<DataOutPutDTO> primarystaffEnrolledByRegion) {
		this.primarystaffEnrolledByRegion = primarystaffEnrolledByRegion;
	}

	public List<DataOutPutByGenderDTO> getPrimaryStaffEnrolledByGenderByRegion() {
		return primaryStaffEnrolledByGenderByRegion;
	}

	public void setPrimaryStaffEnrolledByGenderByRegion(
			List<DataOutPutByGenderDTO> primaryStaffEnrolledByGenderByRegion) {
		this.primaryStaffEnrolledByGenderByRegion = primaryStaffEnrolledByGenderByRegion;
	}

	public List<DataOutPutDTO> getPrimarylearnsEnrolledByRegion() {
		return primarylearnsEnrolledByRegion;
	}

	public void setPrimarylearnsEnrolledByRegion(List<DataOutPutDTO> primarylearnsEnrolledByRegion) {
		this.primarylearnsEnrolledByRegion = primarylearnsEnrolledByRegion;
	}

	public List<DataOutPutByGenderDTO> getPrimarylearnersEnrolledByGenderRegion() {
		return primarylearnersEnrolledByGenderRegion;
	}

	public void setPrimarylearnersEnrolledByGenderRegion(
			List<DataOutPutByGenderDTO> primarylearnersEnrolledByGenderRegion) {
		this.primarylearnersEnrolledByGenderRegion = primarylearnersEnrolledByGenderRegion;
	}

	public List<DataOutPutDTO> getSecondarystaffEnrolledByRegion() {
		return secondarystaffEnrolledByRegion;
	}

	public void setSecondarystaffEnrolledByRegion(List<DataOutPutDTO> secondarystaffEnrolledByRegion) {
		this.secondarystaffEnrolledByRegion = secondarystaffEnrolledByRegion;
	}

	public List<DataOutPutByGenderDTO> getSecondaryStaffEnrolledByGenderByRegion() {
		return secondaryStaffEnrolledByGenderByRegion;
	}

	public void setSecondaryStaffEnrolledByGenderByRegion(
			List<DataOutPutByGenderDTO> secondaryStaffEnrolledByGenderByRegion) {
		this.secondaryStaffEnrolledByGenderByRegion = secondaryStaffEnrolledByGenderByRegion;
	}

	public List<DataOutPutDTO> getSecondarylearnsEnrolledByRegion() {
		return secondarylearnsEnrolledByRegion;
	}

	public void setSecondarylearnsEnrolledByRegion(List<DataOutPutDTO> secondarylearnsEnrolledByRegion) {
		this.secondarylearnsEnrolledByRegion = secondarylearnsEnrolledByRegion;
	}

	public List<DataOutPutByGenderDTO> getSecondarylearnersEnrolledByGenderRegion() {
		return secondarylearnersEnrolledByGenderRegion;
	}

	public void setSecondarylearnersEnrolledByGenderRegion(
			List<DataOutPutByGenderDTO> secondarylearnersEnrolledByGenderRegion) {
		this.secondarylearnersEnrolledByGenderRegion = secondarylearnersEnrolledByGenderRegion;
	}

	public List<DataOutPutDTO> getInstitutionstaffEnrolledByRegion() {
		return institutionstaffEnrolledByRegion;
	}

	public void setInstitutionstaffEnrolledByRegion(List<DataOutPutDTO> institutionstaffEnrolledByRegion) {
		this.institutionstaffEnrolledByRegion = institutionstaffEnrolledByRegion;
	}

	public List<DataOutPutByGenderDTO> getInstitutionStaffEnrolledByGenderByRegion() {
		return institutionStaffEnrolledByGenderByRegion;
	}

	public void setInstitutionStaffEnrolledByGenderByRegion(
			List<DataOutPutByGenderDTO> institutionStaffEnrolledByGenderByRegion) {
		this.institutionStaffEnrolledByGenderByRegion = institutionStaffEnrolledByGenderByRegion;
	}

	public List<DataOutPutDTO> getInstitutionlearnsEnrolledByRegion() {
		return institutionlearnsEnrolledByRegion;
	}

	public void setInstitutionlearnsEnrolledByRegion(List<DataOutPutDTO> institutionlearnsEnrolledByRegion) {
		this.institutionlearnsEnrolledByRegion = institutionlearnsEnrolledByRegion;
	}

	public List<DataOutPutByGenderDTO> getInstitutionlearnersEnrolledByGenderRegion() {
		return institutionlearnersEnrolledByGenderRegion;
	}

	public void setInstitutionlearnersEnrolledByGenderRegion(
			List<DataOutPutByGenderDTO> institutionlearnersEnrolledByGenderRegion) {
		this.institutionlearnersEnrolledByGenderRegion = institutionlearnersEnrolledByGenderRegion;
	}

	public long getPrimaryLearnersWithSpecialNeedsMale() {
		return primaryLearnersWithSpecialNeedsMale;
	}

	public void setPrimaryLearnersWithSpecialNeedsMale(long primaryLearnersWithSpecialNeedsMale) {
		this.primaryLearnersWithSpecialNeedsMale = primaryLearnersWithSpecialNeedsMale;
	}

	public long getInstitutionLearnersWithSpecialNeedsMale() {
		return institutionLearnersWithSpecialNeedsMale;
	}

	public void setInstitutionLearnersWithSpecialNeedsMale(long institutionLearnersWithSpecialNeedsMale) {
		this.institutionLearnersWithSpecialNeedsMale = institutionLearnersWithSpecialNeedsMale;
	}

	public long getSecondaryLearnersWithSpecialNeedsMale() {
		return secondaryLearnersWithSpecialNeedsMale;
	}

	public void setSecondaryLearnersWithSpecialNeedsMale(long secondaryLearnersWithSpecialNeedsMale) {
		this.secondaryLearnersWithSpecialNeedsMale = secondaryLearnersWithSpecialNeedsMale;
	}

	public long getPrimaryLearnersWithSpecialNeedsFemale() {
		return primaryLearnersWithSpecialNeedsFemale;
	}

	public void setPrimaryLearnersWithSpecialNeedsFemale(long primaryLearnersWithSpecialNeedsFemale) {
		this.primaryLearnersWithSpecialNeedsFemale = primaryLearnersWithSpecialNeedsFemale;
	}

	public long getInstitutionLearnersWithSpecialNeedsFemale() {
		return institutionLearnersWithSpecialNeedsFemale;
	}

	public void setInstitutionLearnersWithSpecialNeedsFemale(long institutionLearnersWithSpecialNeedsFemale) {
		this.institutionLearnersWithSpecialNeedsFemale = institutionLearnersWithSpecialNeedsFemale;
	}

	public long getSecondaryLearnersWithSpecialNeedsFemale() {
		return secondaryLearnersWithSpecialNeedsFemale;
	}

	public void setSecondaryLearnersWithSpecialNeedsFemale(long secondaryLearnersWithSpecialNeedsFemale) {
		this.secondaryLearnersWithSpecialNeedsFemale = secondaryLearnersWithSpecialNeedsFemale;
	}

}
