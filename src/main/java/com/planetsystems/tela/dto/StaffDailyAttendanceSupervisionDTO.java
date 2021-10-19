package com.planetsystems.tela.dto;

import java.util.List;

public class StaffDailyAttendanceSupervisionDTO extends ParentDTO{

    private SchoolStaffDTO supervisorDTO;
    private SchoolStaffDTO schoolStaffDTO;

    private String comment;

    private String supervisionDate;

    private String supervisionTime;
    
    private String clockinTime;
    private String clockoutTime;
    private String supervisionStatus;

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

    public SchoolStaffDTO getSchoolStaffDTO() {
        return schoolStaffDTO;
    }

    public void setSchoolStaffDTO(SchoolStaffDTO schoolStaffDTO) {
        this.schoolStaffDTO = schoolStaffDTO;
    }
    
    

    public String getClockinTime() {
		return clockinTime;
	}

	public void setClockinTime(String clockinTime) {
		this.clockinTime = clockinTime;
	}

	public String getClockoutTime() {
		return clockoutTime;
	}

	public void setClockoutTime(String clockoutTime) {
		this.clockoutTime = clockoutTime;
	}
	
	

	public String getSupervisionStatus() {
		return supervisionStatus;
	}

	public void setSupervisionStatus(String supervisionStatus) {
		this.supervisionStatus = supervisionStatus;
	}

	@Override
    public String toString() {
        return "StaffDailyAttendanceSupervisionDTO{" +
                "supervisorDTO=" + supervisorDTO +
                ", schoolStaffDTO=" + schoolStaffDTO +
                ", comment='" + comment + '\'' +
                ", supervisionDate='" + supervisionDate + '\'' +
                ", supervisionTime='" + supervisionTime + '\'' +
                ", staffDailyAttendanceTaskSupervisionDTOS=" + staffDailyAttendanceTaskSupervisionDTOS +
                '}';
    }
    
}
