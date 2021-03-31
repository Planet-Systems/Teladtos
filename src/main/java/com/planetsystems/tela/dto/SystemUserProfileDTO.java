package com.planetsystems.tela.dto;

public class SystemUserProfileDTO extends ParentDTO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private SystemUserDTO systemUser;

    private SystemUserGroupDTO systemUserGroup;

    private GeneralUserDetailDTO generalUserDetail;

    public SystemUserProfileDTO() {
    }

    public SystemUserProfileDTO(String id) {
        super(id);
    }

    public SystemUserDTO getSystemUser() {
        return systemUser;
    }

    public void setSystemUser(SystemUserDTO systemUser) {
        this.systemUser = systemUser;
    }

    public SystemUserGroupDTO getSystemUserGroup() {
        return systemUserGroup;
    }

    public void setSystemUserGroup(SystemUserGroupDTO systemUserGroup) {
        this.systemUserGroup = systemUserGroup;
    }

    public GeneralUserDetailDTO getGeneralUserDetail() {
        return generalUserDetail;
    }

    public void setGeneralUserDetail(GeneralUserDetailDTO generalUserDetail) {
        this.generalUserDetail = generalUserDetail;
    }

    @Override
    public String toString() {
        return "SystemUserProfileDTO{" +
                "systemUser=" + systemUser +
                ", systemUserGroup=" + systemUserGroup +
                ", generalUserDetail=" + generalUserDetail +
                '}';
    }
}
