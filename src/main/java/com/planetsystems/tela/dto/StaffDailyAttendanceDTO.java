package com.planetsystems.tela.dto;

import java.util.List;

public class StaffDailyAttendanceDTO extends ParentDTO {

    private AcademicTermDTO academicTermDTO;

    private SchoolStaffDTO schoolStaffDTO;

    private String comment;

    private String dailyAttendanceDateTime;

    private List<StaffDailyAttendanceTaskDTO> staffDailyAttendanceTaskDTOS;

    public StaffDailyAttendanceDTO() {
    }

    public StaffDailyAttendanceDTO(String id) {
        super(id);
    }

    public AcademicTermDTO getAcademicTermDTO() {
        return academicTermDTO;
    }

    public void setAcademicTermDTO(AcademicTermDTO academicTermDTO) {
        this.academicTermDTO = academicTermDTO;
    }

    public SchoolStaffDTO getSchoolStaffDTO() {
        return schoolStaffDTO;
    }

    public void setSchoolStaffDTO(SchoolStaffDTO schoolStaffDTO) {
        this.schoolStaffDTO = schoolStaffDTO;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDailyAttendanceDateTime() {
        return dailyAttendanceDateTime;
    }

    public void setDailyAttendanceDateTime(String dailyAttendanceDateTime) {
        this.dailyAttendanceDateTime = dailyAttendanceDateTime;
    }

    public List<StaffDailyAttendanceTaskDTO> getStaffDailyAttendanceTaskDTOS() {
        return staffDailyAttendanceTaskDTOS;
    }

    public void setStaffDailyAttendanceTaskDTOS(List<StaffDailyAttendanceTaskDTO> staffDailyAttendanceTaskDTOS) {
        this.staffDailyAttendanceTaskDTOS = staffDailyAttendanceTaskDTOS;
    }

    @Override
    public String toString() {
        return "StaffDailyAttendanceDTO{" +
                "academicTermDTO=" + academicTermDTO +
                ", schoolStaffDTO=" + schoolStaffDTO +
                ", comment='" + comment + '\'' +
                ", dailyAttendanceDateTime='" + dailyAttendanceDateTime + '\'' +
                ", staffDailyAttendanceTaskDTOS=" + staffDailyAttendanceTaskDTOS +
                '}';
    }
}
