package com.planetsystems.tela.dto;

public class StaffDailyAttendanceTaskDTO extends ParentDTO{

    private SchoolClassDTO schoolClassDTO;

    private SubjectDTO subjectDTO;

    private String startTime;
    private String endTime;
    private String attendanceStatus;
    private String dailyAttendanceDate;

    private StaffDailyAttendanceDTO staffDailyAttendanceDTO;

    public StaffDailyAttendanceTaskDTO() {
    }

    public StaffDailyAttendanceTaskDTO(String id) {
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

    public String getDailyAttendanceDate() {
        return dailyAttendanceDate;
    }

    public void setDailyAttendanceDate(String dailyAttendanceDate) {
        this.dailyAttendanceDate = dailyAttendanceDate;
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

    public StaffDailyAttendanceDTO getStaffDailyAttendanceDTO() {
        return staffDailyAttendanceDTO;
    }

    public void setStaffDailyAttendanceDTO(StaffDailyAttendanceDTO staffDailyAttendanceDTO) {
        this.staffDailyAttendanceDTO = staffDailyAttendanceDTO;
    }


    @Override
    public String toString() {
        return "StaffDailyAttendanceTaskDTO{" +
                "schoolClassDTO=" + schoolClassDTO +
                ", subjectDTO=" + subjectDTO +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", attendanceStatus='" + attendanceStatus + '\'' +
                ", dailyAttendanceDate='" + dailyAttendanceDate + '\'' +
                ", staffDailyAttendanceDTO=" + staffDailyAttendanceDTO +
                '}';
    }
}
