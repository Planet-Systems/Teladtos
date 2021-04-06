package com.planetsystems.tela.dto;

public class StaffDailyTimeTableLessonDTO extends ParentDTO{

    private SchoolClassDTO schoolClassDTO;

    private SubjectDTO subjectDTO;

    private String startTime;
    private String endTime;
    private String attendanceStatus;
    private String lessonDay;

    private StaffDailyTimeTableDTO staffDailyTimeTableDTO;

    public StaffDailyTimeTableLessonDTO() {
    }

    public StaffDailyTimeTableLessonDTO(String id) {
        super(id);
    }

    public SchoolClassDTO getSchoolClassDTO() {
        return schoolClassDTO;
    }

    public void setSchoolClassDTO(SchoolClassDTO schoolClassDTO) {
        this.schoolClassDTO = schoolClassDTO;
    }

    public SubjectDTO getSubjectDTO() {
        return subjectDTO;
    }

    public void setSubjectDTO(SubjectDTO subjectDTO) {
        this.subjectDTO = subjectDTO;
    }

    public String getLessonDay() {
        return lessonDay;
    }

    public void setLessonDay(String lessonDay) {
        this.lessonDay = lessonDay;
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

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    public StaffDailyTimeTableDTO getStaffDailyTimeTableDTO() {
        return staffDailyTimeTableDTO;
    }

    public void setStaffDailyTimeTableDTO(StaffDailyTimeTableDTO staffDailyTimeTableDTO) {
        this.staffDailyTimeTableDTO = staffDailyTimeTableDTO;
    }

    @Override
    public String toString() {
        return "StaffDailyTimeTableLessonDTO{" +
                "schoolClassDTO=" + schoolClassDTO +
                ", subjectDTO=" + subjectDTO +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", attendanceStatus='" + attendanceStatus + '\'' +
                ", lessonDay='" + lessonDay + '\'' +
                ", staffDailyTimeTableDTO=" + staffDailyTimeTableDTO +
                '}';
    }
}
