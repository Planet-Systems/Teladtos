package com.planetsystems.tela.dto;

public class StaffDailyAttendanceTaskSupervisionDTO extends ParentDTO {

   private StaffDailyAttendanceSupervisionDTO staffDailyAttendanceSupervisionDTO;

   private StaffDailyAttendanceDTO staffDailyAttendanceDTO;


    private String teachingStatus;

    private String teachingTimeStatus;

    public StaffDailyAttendanceTaskSupervisionDTO() {
    }

    public StaffDailyAttendanceTaskSupervisionDTO(String id) {
        super(id);
    }

    public StaffDailyAttendanceSupervisionDTO getStaffDailyAttendanceSupervisionDTO() {
        return staffDailyAttendanceSupervisionDTO;
    }

    public void setStaffDailyAttendanceSupervisionDTO(StaffDailyAttendanceSupervisionDTO staffDailyAttendanceSupervisionDTO) {
        this.staffDailyAttendanceSupervisionDTO = staffDailyAttendanceSupervisionDTO;
    }

    public StaffDailyAttendanceDTO getStaffDailyAttendanceDTO() {
        return staffDailyAttendanceDTO;
    }

    public void setStaffDailyAttendanceDTO(StaffDailyAttendanceDTO staffDailyAttendanceDTO) {
        this.staffDailyAttendanceDTO = staffDailyAttendanceDTO;
    }

    public String getTeachingStatus() {
        return teachingStatus;
    }

    public void setTeachingStatus(String teachingStatus) {
        this.teachingStatus = teachingStatus;
    }

    public String getTeachingTimeStatus() {
        return teachingTimeStatus;
    }

    public void setTeachingTimeStatus(String teachingTimeStatus) {
        this.teachingTimeStatus = teachingTimeStatus;
    }

    @Override
    public String toString() {
        return "StaffDailyAttendanceTaskSupervisionDTO{" +
                "staffDailyAttendanceSupervisionDTO=" + staffDailyAttendanceSupervisionDTO +
                ", staffDailyAttendanceDTO=" + staffDailyAttendanceDTO +
                ", teachingStatus='" + teachingStatus + '\'' +
                ", teachingTimeStatus='" + teachingTimeStatus + '\'' +
                '}';
    }
}
