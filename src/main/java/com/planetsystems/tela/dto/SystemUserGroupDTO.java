package com.planetsystems.tela.dto;

public class SystemUserGroupDTO extends ParentDTO {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;
    private String name;
    private String description;
    private boolean defaultGroup = false;
    private boolean receiveAlerts = false;
    private boolean administrativeRole= false;
    
//    private SystemUserDTO createdBy;
//    private SystemUserDTO updatedBy;
    
    private String userLevel;

    private SystemUserProfileDTO createdBy;
    private SystemUserProfileDTO updatedBy;

    public SystemUserGroupDTO() {
    }

    public SystemUserGroupDTO(String id) {
        super(id);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDefaultGroup() {
        return defaultGroup;
    }

    public void setDefaultGroup(boolean defaultGroup) {
        this.defaultGroup = defaultGroup;
    }

    public boolean isReceiveAlerts() {
        return receiveAlerts;
    }

    public void setReceiveAlerts(boolean receiveAlerts) {
        this.receiveAlerts = receiveAlerts;
    }

    public SystemUserProfileDTO getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(SystemUserProfileDTO createdBy) {
        this.createdBy = createdBy;
    }

    public SystemUserProfileDTO getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(SystemUserProfileDTO updatedBy) {
        this.updatedBy = updatedBy;
    }

    public boolean isAdministrativeRole() {
		return administrativeRole;
	}

	public void setAdministrativeRole(boolean administrativeRole) {
		this.administrativeRole = administrativeRole;
	}

	public String getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

}
