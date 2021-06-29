package com.planetsystems.tela.dto;


public class TimeAttendanceSupervisionDTO extends ParentDTO {
    private String supervisionDate;
    private String supervisionTime;
    private String comment;
     private SchoolDTO schoolDTO;
    private SchoolStaffDTO schoolStaffDTO;
    private String attendanceStatus;
   private SystemUserDTO supervisor;

    public TimeAttendanceSupervisionDTO() {
    }

    public TimeAttendanceSupervisionDTO(String id) {

        super(id);
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public SchoolDTO getSchoolDTO() {
        return schoolDTO;
    }

    public void setSchoolDTO(SchoolDTO schoolDTO) {
        this.schoolDTO = schoolDTO;
    }

    public SchoolStaffDTO getSchoolStaffDTO() {
        return schoolStaffDTO;
    }

    public void setSchoolStaffDTO(SchoolStaffDTO schoolStaffDTO) {
        this.schoolStaffDTO = schoolStaffDTO;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }

    public void setAttendanceStatus(String attendanceStatus) {
        this.attendanceStatus = attendanceStatus;
    }

    public SystemUserDTO getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(SystemUserDTO supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TimeAttendanceSupervisionDTO{");
        sb.append("supervisionDate='").append(supervisionDate).append('\'');
        sb.append(", supervisionTime='").append(supervisionTime).append('\'');
        sb.append(", comment='").append(comment).append('\'');
        sb.append(", schoolDTO=").append(schoolDTO);
        sb.append(", schoolStaffDTO=").append(schoolStaffDTO);
        sb.append(", attendanceStatus='").append(attendanceStatus).append('\'');
        sb.append(", supervisor=").append(supervisor);
        sb.append('}');
        return sb.toString();
    }
}
