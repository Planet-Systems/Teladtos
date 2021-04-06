package com.planetsystems.tela.dto;

public class StaffDailyAttendanceTaskSupervisionDTO extends ParentDTO {

   private StaffDailyAttendanceSupervisionDTO staffDailyAttendanceSupervisionDTO;

   private StaffDailyTimeTableDTO staffDailyTimeTableDTO;


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

    public StaffDailyTimeTableDTO getStaffDailyTimeTableDTO() {
        return staffDailyTimeTableDTO;
    }

    public void setStaffDailyTimeTableDTO(StaffDailyTimeTableDTO staffDailyTimeTableDTO) {
        this.staffDailyTimeTableDTO = staffDailyTimeTableDTO;
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
                ", staffDailyTimeTableDTO=" + staffDailyTimeTableDTO +
                ", teachingStatus='" + teachingStatus + '\'' +
                ", teachingTimeStatus='" + teachingTimeStatus + '\'' +
                '}';
    }
}
