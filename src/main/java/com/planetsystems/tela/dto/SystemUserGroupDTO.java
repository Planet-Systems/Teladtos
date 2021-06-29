package com.planetsystems.tela.dto;


public class SystemUserGroupDTO extends ParentDTO {
	private static final long serialVersionUID = 1L;
	
	private String code;
    private String name;
    private String description;
    private boolean defaultGroup = false;
    private boolean receiveAlerts = false;
    private boolean administrativeRole= false;
    
//    private SystemUserDTO createdBy;
//    private SystemUserDTO updatedBy;

    private SystemUserProfileDTO createdBy;
    private SystemUserProfileDTO updatedBy;

    public SystemUserGroupDTO() {
    }

    public SystemUserGroupDTO(String id) {
        super(id);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public boolean isAdministrativeRole() {
        return administrativeRole;
    }

    public void setAdministrativeRole(boolean administrativeRole) {
        this.administrativeRole = administrativeRole;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SystemUserGroupDTO{");
        sb.append("code='").append(code).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", defaultGroup=").append(defaultGroup);
        sb.append(", receiveAlerts=").append(receiveAlerts);
        sb.append(", administrativeRole=").append(administrativeRole);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append('}');
        return sb.toString();
    }
}
