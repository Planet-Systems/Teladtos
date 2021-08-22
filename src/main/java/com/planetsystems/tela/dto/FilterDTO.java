package com.planetsystems.tela.dto;

public class FilterDTO extends ParentDTO{
    private AcademicYearDTO academicYearDTO;
    private AcademicTermDTO academicTermDTO;
    private  RegionDto regionDto;
    private DistrictDTO districtDTO;
    private SchoolCategoryDTO schoolCategoryDTO;
    private SchoolClassDTO schoolClassDTO;
    private SchoolDTO schoolDTO;
    private SchoolStaffDTO schoolStaffDTO;
    private SubjectCategoryDTO subjectCategoryDTO;
    private  SubjectDTO subjectDTO;
    private String date;
    private String month;
    private String week;
    private String fromDate;
    private String toDate;
    private StaffDailyAttendanceSupervisionDTO staffDailyAttendanceSupervisionDTO;

    public FilterDTO() {
    }

    public AcademicYearDTO getAcademicYearDTO() {
        return academicYearDTO;
    }

    public void setAcademicYearDTO(AcademicYearDTO academicYearDTO) {
        this.academicYearDTO = academicYearDTO;
    }

    public AcademicTermDTO getAcademicTermDTO() {
        return academicTermDTO;
    }

    public void setAcademicTermDTO(AcademicTermDTO academicTermDTO) {
        this.academicTermDTO = academicTermDTO;
    }

    public RegionDto getRegionDto() {
        return regionDto;
    }

    public void setRegionDto(RegionDto regionDto) {
        this.regionDto = regionDto;
    }

    public DistrictDTO getDistrictDTO() {
        return districtDTO;
    }

    public void setDistrictDTO(DistrictDTO districtDTO) {
        this.districtDTO = districtDTO;
    }

    public SchoolCategoryDTO getSchoolCategoryDTO() {
        return schoolCategoryDTO;
    }

    public void setSchoolCategoryDTO(SchoolCategoryDTO schoolCategoryDTO) {
        this.schoolCategoryDTO = schoolCategoryDTO;
    }

    public SchoolClassDTO getSchoolClassDTO() {
        return schoolClassDTO;
    }

    public void setSchoolClassDTO(SchoolClassDTO schoolClassDTO) {
        this.schoolClassDTO = schoolClassDTO;
    }

    public SchoolDTO getSchoolDTO() {
        return schoolDTO;
    }

    public void setSchoolDTO(SchoolDTO schoolDTO) {
        this.schoolDTO = schoolDTO;
    }

    public SchoolStaffDTO getSchoolStaffDTO() {
        return schoolStaffDTO;
    }

    public void setSchoolStaffDTO(SchoolStaffDTO schoolStaffDTO) {
        this.schoolStaffDTO = schoolStaffDTO;
    }

    public SubjectCategoryDTO getSubjectCategoryDTO() {
        return subjectCategoryDTO;
    }

    public void setSubjectCategoryDTO(SubjectCategoryDTO subjectCategoryDTO) {
        this.subjectCategoryDTO = subjectCategoryDTO;
    }

    public SubjectDTO getSubjectDTO() {
        return subjectDTO;
    }

    public void setSubjectDTO(SubjectDTO subjectDTO) {
        this.subjectDTO = subjectDTO;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }
    
    

    public StaffDailyAttendanceSupervisionDTO getStaffDailyAttendanceSupervisionDTO() {
		return staffDailyAttendanceSupervisionDTO;
	}

	public void setStaffDailyAttendanceSupervisionDTO(
			StaffDailyAttendanceSupervisionDTO staffDailyAttendanceSupervisionDTO) {
		this.staffDailyAttendanceSupervisionDTO = staffDailyAttendanceSupervisionDTO;
	}

	@Override
    public String toString() {
        return "FilterDTO{" +
                "academicYearDTO=" + academicYearDTO +
                ", academicTermDTO=" + academicTermDTO +
                ", regionDto=" + regionDto +
                ", districtDTO=" + districtDTO +
                ", schoolCategoryDTO=" + schoolCategoryDTO +
                ", schoolClassDTO=" + schoolClassDTO +
                ", schoolDTO=" + schoolDTO +
                ", schoolStaffDTO=" + schoolStaffDTO +
                ", subjectCategoryDTO=" + subjectCategoryDTO +
                ", subjectDTO=" + subjectDTO +
                ", date='" + date + '\'' +
                ", month='" + month + '\'' +
                ", week='" + week + '\'' +
                ", fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                '}';
    }
}
