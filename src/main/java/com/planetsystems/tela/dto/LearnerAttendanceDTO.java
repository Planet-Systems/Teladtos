package com.planetsystems.tela.dto;

import java.time.LocalDate;

public class LearnerAttendanceDTO extends  ParentDTO {

    private SchoolClassDTO schoolClassDTO;

    private AcademicTermDTO academicTermDTO;

    private SchoolStaffDTO schoolStaffDTO;

    private String attendanceDate;
    private long girlsPresent;
    private long boysPresent;
    private long boysAbsent;
    private long girlsAbsent;
    private String comment;

    public LearnerAttendanceDTO() {
    }

    public SchoolClassDTO getSchoolClassDTO() {
        return schoolClassDTO;
    }

    public void setSchoolClassDTO(SchoolClassDTO schoolClassDTO) {
        this.schoolClassDTO = schoolClassDTO;
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

    public String getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(String attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public long getGirlsPresent() {
        return girlsPresent;
    }

    public void setGirlsPresent(long girlsPresent) {
        this.girlsPresent = girlsPresent;
    }

    public long getBoysPresent() {
        return boysPresent;
    }

    public void setBoysPresent(long boysPresent) {
        this.boysPresent = boysPresent;
    }

    public long getBoysAbsent() {
        return boysAbsent;
    }

    public void setBoysAbsent(long boysAbsent) {
        this.boysAbsent = boysAbsent;
    }

    public long getGirlsAbsent() {
        return girlsAbsent;
    }

    public void setGirlsAbsent(long girlsAbsent) {
        this.girlsAbsent = girlsAbsent;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "LearnerAttendanceDTO{" +
                "schoolClassDTO=" + schoolClassDTO +
                ", academicTermDTO=" + academicTermDTO +
                ", schoolStaffDTO=" + schoolStaffDTO +
                ", attendanceDate='" + attendanceDate + '\'' +
                ", girlsPresent=" + girlsPresent +
                ", boysPresent=" + boysPresent +
                ", boysAbsent=" + boysAbsent +
                ", girlsAbsent=" + girlsAbsent +
                ", comment='" + comment + '\'' +
                '}';
    }
}
