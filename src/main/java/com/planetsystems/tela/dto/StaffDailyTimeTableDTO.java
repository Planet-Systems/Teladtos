package com.planetsystems.tela.dto;

import java.util.List;

public class StaffDailyTimeTableDTO extends ParentDTO {

    private AcademicTermDTO academicTermDTO;

    private SchoolStaffDTO schoolStaffDTO;

    private String comment;

    private String lessonDay;

    private List<StaffDailyTimeTableLessonDTO> staffDailyTimeTableLessonDTOS;

    public StaffDailyTimeTableDTO() {
    }

    public StaffDailyTimeTableDTO(String id) {
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

    public String getLessonDay() {
        return lessonDay;
    }

    public void setLessonDay(String lessonDay) {
        this.lessonDay = lessonDay;
    }

    public List<StaffDailyTimeTableLessonDTO> getStaffDailyTimeTableLessonDTOS() {
        return staffDailyTimeTableLessonDTOS;
    }

    public void setStaffDailyTimeTableLessonDTOS(List<StaffDailyTimeTableLessonDTO> staffDailyTimeTableLessonDTOS) {
        this.staffDailyTimeTableLessonDTOS = staffDailyTimeTableLessonDTOS;
    }

    @Override
    public String toString() {
        return "StaffDailyTimeTableDTO{" +
                "academicTermDTO=" + academicTermDTO +
                ", schoolStaffDTO=" + schoolStaffDTO +
                ", comment='" + comment + '\'' +
                ", lessonDay='" + lessonDay + '\'' +
                ", staffDailyTimeTableLessonDTOS=" + staffDailyTimeTableLessonDTOS +
                '}';
    }
}
