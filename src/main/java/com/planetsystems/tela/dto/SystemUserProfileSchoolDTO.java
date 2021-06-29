package com.planetsystems.tela.dto;

import java.io.Serializable;

public class SystemUserProfileSchoolDTO extends ParentDTO implements Serializable {

    private SystemUserProfileDTO systemUserProfileDTO;

    private SchoolDTO schoolDTO;

    public SystemUserProfileSchoolDTO() {
    }

    public SystemUserProfileSchoolDTO(String id) {
        super(id);
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
        final StringBuilder sb = new StringBuilder("SystemUserProfileSchoolDTO{");
        sb.append("systemUserProfileDTO=").append(systemUserProfileDTO);
        sb.append(", schoolDTO=").append(schoolDTO);
        sb.append('}');
        return sb.toString();
    }
}
