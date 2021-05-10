package com.planetsystems.tela.dto;

import java.io.Serializable;
import java.util.List;

public class SmsSchoolStaffDTO implements Serializable{
    private SystemUserProfileDTO systemUserProfileDTO;
    private List<SchoolStaffDTO> schoolStaffDTOS;
    private String message;

    public SmsSchoolStaffDTO() {
    }

    public SystemUserProfileDTO getSystemUserProfileDTO() {
        return systemUserProfileDTO;
    }

    public void setSystemUserProfileDTO(SystemUserProfileDTO systemUserProfileDTO) {
        this.systemUserProfileDTO = systemUserProfileDTO;
    }

    public List<SchoolStaffDTO> getSchoolStaffDTOS() {
        return schoolStaffDTOS;
    }

    public void setSchoolStaffDTOS(List<SchoolStaffDTO> schoolStaffDTOS) {
        this.schoolStaffDTOS = schoolStaffDTOS;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
