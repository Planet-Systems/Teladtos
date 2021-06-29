package com.planetsystems.tela.dto;


public class SystemUserProfileDTO extends ParentDTO {
	private static final long serialVersionUID = 1L;
	private SystemUserDTO systemUserDTO;
    private SystemUserGroupDTO systemUserGroupDTO;
    private GeneralUserDetailDTO generalUserDetailDTO;

    public SystemUserProfileDTO() {
    }

    public SystemUserProfileDTO(String id) {
        super(id);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public SystemUserDTO getSystemUserDTO() {
        return systemUserDTO;
    }

    public void setSystemUserDTO(SystemUserDTO systemUserDTO) {
        this.systemUserDTO = systemUserDTO;
    }

    public SystemUserGroupDTO getSystemUserGroupDTO() {
        return systemUserGroupDTO;
    }

    public void setSystemUserGroupDTO(SystemUserGroupDTO systemUserGroupDTO) {
        this.systemUserGroupDTO = systemUserGroupDTO;
    }

    public GeneralUserDetailDTO getGeneralUserDetailDTO() {
        return generalUserDetailDTO;
    }

    public void setGeneralUserDetailDTO(GeneralUserDetailDTO generalUserDetailDTO) {
        this.generalUserDetailDTO = generalUserDetailDTO;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SystemUserProfileDTO{");
        sb.append("systemUserDTO=").append(systemUserDTO);
        sb.append(", systemUserGroupDTO=").append(systemUserGroupDTO);
        sb.append(", generalUserDetailDTO=").append(generalUserDetailDTO);
        sb.append('}');
        return sb.toString();
    }
}
