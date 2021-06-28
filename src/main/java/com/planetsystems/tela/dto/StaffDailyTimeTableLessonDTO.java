package com.planetsystems.tela.dto;


public class StaffDailyTimeTableLessonDTO extends ParentDTO{
    private SchoolClassDTO schoolClassDTO;
    private SubjectDTO subjectDTO;
    private String startTime;
    private String endTime;
    private String dailyTimeTableLessonStatus;
    private String lessonDate;
    private StaffDailyTimeTableDTO staffDailyTimeTableDTO;

    public StaffDailyTimeTableLessonDTO() {
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

    public String getDailyTimeTableLessonStatus() {
        return dailyTimeTableLessonStatus;
    }

    public void setDailyTimeTableLessonStatus(String dailyTimeTableLessonStatus) {
        this.dailyTimeTableLessonStatus = dailyTimeTableLessonStatus;
    }

    public String getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(String lessonDate) {
        this.lessonDate = lessonDate;
    }

    public StaffDailyTimeTableDTO getStaffDailyTimeTableDTO() {
        return staffDailyTimeTableDTO;
    }

    public void setStaffDailyTimeTableDTO(StaffDailyTimeTableDTO staffDailyTimeTableDTO) {
        this.staffDailyTimeTableDTO = staffDailyTimeTableDTO;
    }
}
