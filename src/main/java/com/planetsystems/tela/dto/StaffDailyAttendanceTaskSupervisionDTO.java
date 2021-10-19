package com.planetsystems.tela.dto;

public class StaffDailyAttendanceTaskSupervisionDTO extends ParentDTO {

   private StaffDailyAttendanceSupervisionDTO staffDailyAttendanceSupervisionDTO;

   //private StaffDailyTimeTableDTO staffDailyTimeTableDTO;

   StaffDailyTimeTableLessonDTO staffDailyTimeTableLessonDTO;

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
    
    

    public StaffDailyTimeTableLessonDTO getStaffDailyTimeTableLessonDTO() {
		return staffDailyTimeTableLessonDTO;
	}

	public void setStaffDailyTimeTableLessonDTO(StaffDailyTimeTableLessonDTO staffDailyTimeTableLessonDTO) {
		this.staffDailyTimeTableLessonDTO = staffDailyTimeTableLessonDTO;
	}

	@Override
    public String toString() {
        return "StaffDailyAttendanceTaskSupervisionDTO{" +
                "staffDailyAttendanceSupervisionDTO=" + staffDailyAttendanceSupervisionDTO +
                ", staffDailyTimeTableDTO=" + staffDailyTimeTableLessonDTO +
                ", teachingStatus='" + teachingStatus + '\'' +
                ", teachingTimeStatus='" + teachingTimeStatus + '\'' +
                '}';
    }
}
