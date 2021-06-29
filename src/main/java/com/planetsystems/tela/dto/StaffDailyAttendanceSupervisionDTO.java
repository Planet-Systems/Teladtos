package com.planetsystems.tela.dto;


import java.util.List;
public class StaffDailyAttendanceSupervisionDTO extends ParentDTO{
    private SchoolStaffDTO supervisorDTO;
    private SchoolStaffDTO schoolStaffDTO;
    private String comment;
    private String supervisionDate;
    private String supervisionTime;
   private List<StaffDailyAttendanceTaskSupervisionDTO> staffDailyAttendanceTaskSupervisionDTOS;


    public StaffDailyAttendanceSupervisionDTO() {
    }

    public StaffDailyAttendanceSupervisionDTO(String id) {
        super(id);
    }

    public SchoolStaffDTO getSupervisorDTO() {
        return supervisorDTO;
    }

    public void setSupervisorDTO(SchoolStaffDTO supervisorDTO) {
        this.supervisorDTO = supervisorDTO;
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

    public String getSupervisionDate() {
        return supervisionDate;
    }

    public void setSupervisionDate(String supervisionDate) {
        this.supervisionDate = supervisionDate;
    }

    public String getSupervisionTime() {
        return supervisionTime;
    }

    public void setSupervisionTime(String supervisionTime) {
        this.supervisionTime = supervisionTime;
    }

    public List<StaffDailyAttendanceTaskSupervisionDTO> getStaffDailyAttendanceTaskSupervisionDTOS() {
        return staffDailyAttendanceTaskSupervisionDTOS;
    }

    public void setStaffDailyAttendanceTaskSupervisionDTOS(List<StaffDailyAttendanceTaskSupervisionDTO> staffDailyAttendanceTaskSupervisionDTOS) {
        this.staffDailyAttendanceTaskSupervisionDTOS = staffDailyAttendanceTaskSupervisionDTOS;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StaffDailyAttendanceSupervisionDTO{");
        sb.append("supervisorDTO=").append(supervisorDTO);
        sb.append(", schoolStaffDTO=").append(schoolStaffDTO);
        sb.append(", comment='").append(comment).append('\'');
        sb.append(", supervisionDate='").append(supervisionDate).append('\'');
        sb.append(", supervisionTime='").append(supervisionTime).append('\'');
        sb.append(", staffDailyAttendanceTaskSupervisionDTOS=").append(staffDailyAttendanceTaskSupervisionDTOS);
        sb.append('}');
        return sb.toString();
    }
}
