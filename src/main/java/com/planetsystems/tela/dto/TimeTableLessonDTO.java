package com.planetsystems.tela.dto;

public class TimeTableLessonDTO extends ParentDTO{
    private String lessonDate;

    private SchoolClassDTO schoolClassDTO;

    private SubjectDTO subjectDTO;

    private String startTime;


    private String endTime;

    private SchoolStaffDTO schoolStaffDTO;

    private TimeTableDTO timeTableDTO;

    public TimeTableLessonDTO() {
    }

    public String getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(String lessonDate) {
        this.lessonDate = lessonDate;
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

    public SchoolStaffDTO getSchoolStaffDTO() {
        return schoolStaffDTO;
    }

    public void setSchoolStaffDTO(SchoolStaffDTO schoolStaffDTO) {
        this.schoolStaffDTO = schoolStaffDTO;
    }

    public TimeTableDTO getTimeTableDTO() {
        return timeTableDTO;
    }

    public void setTimeTableDTO(TimeTableDTO timeTableDTO) {
        this.timeTableDTO = timeTableDTO;
    }

    @Override
    public String toString() {
        return "TimeTableLessonDTO{" +
                "lessonDate='" + lessonDate + '\'' +
                ", schoolClassDTO=" + schoolClassDTO +
                ", subjectDTO=" + subjectDTO +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", schoolStaffDTO=" + schoolStaffDTO +
                ", timeTableDTO=" + timeTableDTO +
                '}';
    }
}
