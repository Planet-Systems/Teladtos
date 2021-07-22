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
    private TimeTableDTO timeTableDTO;
    private TimeTableLessonDTO timeTableLessonDTO;
    private StaffDailyTimeTableDTO staffDailyTimeTableDTO;
    private StaffDailyTimeTableLessonDTO staffDailyTimeTableLessonDTO;
    private StaffDailyAttendanceSupervisionDTO staffDailyAttendanceSupervisionDTO;
    private StaffDailyAttendanceTaskSupervisionDTO staffDailyAttendanceTaskSupervisionDTO;
    private String date;
    private String month;
    private String week;
    private String fromDate;
    private String toDate;
    private String day;
    private String startTime;
    private String endTime;
    private String staffType;

    public FilterDTO() {
    }

    public FilterDTO(String id) {
        super(id);
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public TimeTableDTO getTimeTableDTO() {
        return timeTableDTO;
    }

    public void setTimeTableDTO(TimeTableDTO timeTableDTO) {
        this.timeTableDTO = timeTableDTO;
    }

    public TimeTableLessonDTO getTimeTableLessonDTO() {
        return timeTableLessonDTO;
    }

    public void setTimeTableLessonDTO(TimeTableLessonDTO timeTableLessonDTO) {
        this.timeTableLessonDTO = timeTableLessonDTO;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public StaffDailyAttendanceSupervisionDTO getStaffDailyAttendanceSupervisionDTO() {
        return staffDailyAttendanceSupervisionDTO;
    }

    public void setStaffDailyAttendanceSupervisionDTO(StaffDailyAttendanceSupervisionDTO staffDailyAttendanceSupervisionDTO) {
        this.staffDailyAttendanceSupervisionDTO = staffDailyAttendanceSupervisionDTO;
    }

    public StaffDailyAttendanceTaskSupervisionDTO getStaffDailyAttendanceTaskSupervisionDTO() {
        return staffDailyAttendanceTaskSupervisionDTO;
    }

    public void setStaffDailyAttendanceTaskSupervisionDTO(StaffDailyAttendanceTaskSupervisionDTO staffDailyAttendanceTaskSupervisionDTO) {
        this.staffDailyAttendanceTaskSupervisionDTO = staffDailyAttendanceTaskSupervisionDTO;
    }

    public StaffDailyTimeTableDTO getStaffDailyTimeTableDTO() {
        return staffDailyTimeTableDTO;
    }

    public void setStaffDailyTimeTableDTO(StaffDailyTimeTableDTO staffDailyTimeTableDTO) {
        this.staffDailyTimeTableDTO = staffDailyTimeTableDTO;
    }

    public StaffDailyTimeTableLessonDTO getStaffDailyTimeTableLessonDTO() {
        return staffDailyTimeTableLessonDTO;
    }

    public void setStaffDailyTimeTableLessonDTO(StaffDailyTimeTableLessonDTO staffDailyTimeTableLessonDTO) {
        this.staffDailyTimeTableLessonDTO = staffDailyTimeTableLessonDTO;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FilterDTO{");
        sb.append("academicYearDTO=").append(academicYearDTO);
        sb.append(", academicTermDTO=").append(academicTermDTO);
        sb.append(", regionDto=").append(regionDto);
        sb.append(", districtDTO=").append(districtDTO);
        sb.append(", schoolCategoryDTO=").append(schoolCategoryDTO);
        sb.append(", schoolClassDTO=").append(schoolClassDTO);
        sb.append(", schoolDTO=").append(schoolDTO);
        sb.append(", schoolStaffDTO=").append(schoolStaffDTO);
        sb.append(", subjectCategoryDTO=").append(subjectCategoryDTO);
        sb.append(", subjectDTO=").append(subjectDTO);
        sb.append(", timeTableDTO=").append(timeTableDTO);
        sb.append(", timeTableLessonDTO=").append(timeTableLessonDTO);
        sb.append(", staffDailyTimeTableDTO=").append(staffDailyTimeTableDTO);
        sb.append(", staffDailyTimeTableLessonDTO=").append(staffDailyTimeTableLessonDTO);
        sb.append(", staffDailyAttendanceSupervisionDTO=").append(staffDailyAttendanceSupervisionDTO);
        sb.append(", staffDailyAttendanceTaskSupervisionDTO=").append(staffDailyAttendanceTaskSupervisionDTO);
        sb.append(", date='").append(date).append('\'');
        sb.append(", month='").append(month).append('\'');
        sb.append(", week='").append(week).append('\'');
        sb.append(", fromDate='").append(fromDate).append('\'');
        sb.append(", toDate='").append(toDate).append('\'');
        sb.append(", day='").append(day).append('\'');
        sb.append(", startTime='").append(startTime).append('\'');
        sb.append(", endTime='").append(endTime).append('\'');
        sb.append(", staffType='").append(staffType).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
