package com.planetsystems.tela.dto;


public class StaffLessonDTO extends ParentDTO{
    private SchoolDTO schoolDTO;
    private AcademicTermDTO academicTermDTO;
    private SchoolStaffDTO schoolStaffDTO;

    public StaffLessonDTO() {
    }

    public StaffLessonDTO(String id) {
        super(id);
    }

    public SchoolDTO getSchoolDTO() {
        return schoolDTO;
    }

    public void setSchoolDTO(SchoolDTO schoolDTO) {
        this.schoolDTO = schoolDTO;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StaffLessonDTO{");
        sb.append("schoolDTO=").append(schoolDTO);
        sb.append(", academicTermDTO=").append(academicTermDTO);
        sb.append(", schoolStaffDTO=").append(schoolStaffDTO);
        sb.append('}');
        return sb.toString();
    }
}
