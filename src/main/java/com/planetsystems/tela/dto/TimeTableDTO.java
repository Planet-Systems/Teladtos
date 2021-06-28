package com.planetsystems.tela.dto;


import java.util.List;

public class TimeTableDTO extends ParentDTO {
    private SchoolDTO schoolDTO;
    private AcademicTermDTO academicTermDTO;
    private List<TimeTableLessonDTO> timeTableLessonDTOS;

    public TimeTableDTO() {
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

    public List<TimeTableLessonDTO> getTimeTableLessonDTOS() {
        return timeTableLessonDTOS;
    }

    public void setTimeTableLessonDTOS(List<TimeTableLessonDTO> timeTableLessonDTOS) {
        this.timeTableLessonDTOS = timeTableLessonDTOS;
    }
}
