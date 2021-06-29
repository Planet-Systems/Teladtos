package com.planetsystems.tela.dto;

import java.util.List;

public class StaffDailyTimeTableDTO extends ParentDTO {
    private AcademicTermDTO academicTermDTO;
    private SchoolStaffDTO schoolStaffDTO;
    private String comment;
    private String lessonDate;
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

    public String getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(String lessonDate) {
        this.lessonDate = lessonDate;
    }

    public List<StaffDailyTimeTableLessonDTO> getStaffDailyTimeTableLessonDTOS() {
        return staffDailyTimeTableLessonDTOS;
    }

    public void setStaffDailyTimeTableLessonDTOS(List<StaffDailyTimeTableLessonDTO> staffDailyTimeTableLessonDTOS) {
        this.staffDailyTimeTableLessonDTOS = staffDailyTimeTableLessonDTOS;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StaffDailyTimeTableDTO{");
        sb.append("academicTermDTO=").append(academicTermDTO);
        sb.append(", schoolStaffDTO=").append(schoolStaffDTO);
        sb.append(", comment='").append(comment).append('\'');
        sb.append(", lessonDate='").append(lessonDate).append('\'');
        sb.append(", staffDailyTimeTableLessonDTOS=").append(staffDailyTimeTableLessonDTOS);
        sb.append('}');
        return sb.toString();
    }
}
