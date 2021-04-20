package com.planetsystems.tela.dto;

/**
 * to be removed later , since user profile is got from the server
 */

@Deprecated
public class SystemUserProfileSchoolDTO extends ParentDTO {

    private SystemUserProfileDTO systemUserProfileDTO;
    private SchoolDTO schoolDTO;

    public SystemUserProfileSchoolDTO() {
    }

    public SystemUserProfileDTO getSystemUserProfileDTO() {
        return systemUserProfileDTO;
    }

    public void setSystemUserProfileDTO(SystemUserProfileDTO systemUserProfileDTO) {
        this.systemUserProfileDTO = systemUserProfileDTO;
    }

    public SchoolDTO getSchoolDTO() {
        return schoolDTO;
    }

    public void setSchoolDTO(SchoolDTO schoolDTO) {
        this.schoolDTO = schoolDTO;
    }

    @Override
    public String toString() {
        return "SystemUserProfileSchoolDTO{" +
                "systemUserProfileDTO=" + systemUserProfileDTO +
                ", schoolDTO=" + schoolDTO +
                '}';
    }
}
