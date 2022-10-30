package com.planetsystems.tela.dto.dashboard;

import java.io.Serializable;

import com.planetsystems.tela.dto.reports.WeeklyAttendanceRateSummaryDTO;

public class DistrictDashboardSummaryDTO implements Serializable {

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

	private long primaryTeachersWithSpecialNeedslearners;
	private long primaryTeachersWithoutSpecialNeedslearners;

	private long institutionLearners;
	private long institutionLearnersBoys;
	private long institutionLearnersGirls;

	private long institutionTeachers;
	private long institutionTeachersOnPayRoll;
	private long institutionTeachersNotOnPayRoll;
	private long institutionTeachersMale;
	private long institutionTeachersFemale;

	private long institutionTeachersWithSpecialNeedslearners;
	private long institutionTeachersWithoutSpecialNeedslearners;

	private long secondaryLearners;
	private long secondaryLearnersBoys;
	private long secondaryLearnersGirls;

	private long secondaryTeachers;
	private long secondaryTeachersOnPayRoll;
	private long secondaryTeachersNotOnPayRoll;
	private long secondaryTeachersMale;
	private long secondaryTeachersFemale;

	private long secondaryTeachersWithSpecialNeedslearners;
	private long secondaryTeachersWithoutSpecialNeedslearners;

	private WeeklyAttendanceRateSummaryDTO weeklyAttendanceRateSummaryDTO;

	public DistrictDashboardSummaryDTO() {

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

	public long getPrimaryLearners() {
		return primaryLearners;
	}

	public void setPrimaryLearners(long primaryLearners) {
		this.primaryLearners = primaryLearners;
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

	public long getPrimaryTeachers() {
		return primaryTeachers;
	}

	public void setPrimaryTeachers(long primaryTeachers) {
		this.primaryTeachers = primaryTeachers;
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

	public long getPrimaryTeachersWithSpecialNeedslearners() {
		return primaryTeachersWithSpecialNeedslearners;
	}

	public void setPrimaryTeachersWithSpecialNeedslearners(long primaryTeachersWithSpecialNeedslearners) {
		this.primaryTeachersWithSpecialNeedslearners = primaryTeachersWithSpecialNeedslearners;
	}

	public long getPrimaryTeachersWithoutSpecialNeedslearners() {
		return primaryTeachersWithoutSpecialNeedslearners;
	}

	public void setPrimaryTeachersWithoutSpecialNeedslearners(long primaryTeachersWithoutSpecialNeedslearners) {
		this.primaryTeachersWithoutSpecialNeedslearners = primaryTeachersWithoutSpecialNeedslearners;
	}

	public long getInstitutionLearners() {
		return institutionLearners;
	}

	public void setInstitutionLearners(long institutionLearners) {
		this.institutionLearners = institutionLearners;
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

	public long getInstitutionTeachers() {
		return institutionTeachers;
	}

	public void setInstitutionTeachers(long institutionTeachers) {
		this.institutionTeachers = institutionTeachers;
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

	public long getInstitutionTeachersWithSpecialNeedslearners() {
		return institutionTeachersWithSpecialNeedslearners;
	}

	public void setInstitutionTeachersWithSpecialNeedslearners(long institutionTeachersWithSpecialNeedslearners) {
		this.institutionTeachersWithSpecialNeedslearners = institutionTeachersWithSpecialNeedslearners;
	}

	public long getInstitutionTeachersWithoutSpecialNeedslearners() {
		return institutionTeachersWithoutSpecialNeedslearners;
	}

	public void setInstitutionTeachersWithoutSpecialNeedslearners(long institutionTeachersWithoutSpecialNeedslearners) {
		this.institutionTeachersWithoutSpecialNeedslearners = institutionTeachersWithoutSpecialNeedslearners;
	}

	public long getSecondaryLearners() {
		return secondaryLearners;
	}

	public void setSecondaryLearners(long secondaryLearners) {
		this.secondaryLearners = secondaryLearners;
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

	public long getSecondaryTeachers() {
		return secondaryTeachers;
	}

	public void setSecondaryTeachers(long secondaryTeachers) {
		this.secondaryTeachers = secondaryTeachers;
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

	public long getSecondaryTeachersWithSpecialNeedslearners() {
		return secondaryTeachersWithSpecialNeedslearners;
	}

	public void setSecondaryTeachersWithSpecialNeedslearners(long secondaryTeachersWithSpecialNeedslearners) {
		this.secondaryTeachersWithSpecialNeedslearners = secondaryTeachersWithSpecialNeedslearners;
	}

	public long getSecondaryTeachersWithoutSpecialNeedslearners() {
		return secondaryTeachersWithoutSpecialNeedslearners;
	}

	public void setSecondaryTeachersWithoutSpecialNeedslearners(long secondaryTeachersWithoutSpecialNeedslearners) {
		this.secondaryTeachersWithoutSpecialNeedslearners = secondaryTeachersWithoutSpecialNeedslearners;
	}

	public WeeklyAttendanceRateSummaryDTO getWeeklyAttendanceRateSummaryDTO() {
		return weeklyAttendanceRateSummaryDTO;
	}

	public void setWeeklyAttendanceRateSummaryDTO(WeeklyAttendanceRateSummaryDTO weeklyAttendanceRateSummaryDTO) {
		this.weeklyAttendanceRateSummaryDTO = weeklyAttendanceRateSummaryDTO;
	}

}
