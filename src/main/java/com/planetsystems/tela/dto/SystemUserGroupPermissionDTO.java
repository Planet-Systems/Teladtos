package com.planetsystems.tela.dto;


public class SystemUserGroupPermissionDTO extends ParentDTO {
    private SystemUserGroupDTO systemUserGroup;
    private String systemPermission;
    private String permissionType;
    private SystemUserDTO createdBy;
    private SystemUserDTO updatedBy;

    public SystemUserGroupPermissionDTO() {
    }

    public SystemUserGroupPermissionDTO(String id) {
        super(id);
    }

    public SystemUserGroupDTO getSystemUserGroup() {
        return systemUserGroup;
    }

    public void setSystemUserGroup(SystemUserGroupDTO systemUserGroup) {
        this.systemUserGroup = systemUserGroup;
    }

    public String getSystemPermission() {
        return systemPermission;
    }

    public void setSystemPermission(String systemPermission) {
        this.systemPermission = systemPermission;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    public SystemUserDTO getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(SystemUserDTO createdBy) {
        this.createdBy = createdBy;
    }

    public SystemUserDTO getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(SystemUserDTO updatedBy) {
        this.updatedBy = updatedBy;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SystemUserGroupPermissionDTO{");
        sb.append("systemUserGroup=").append(systemUserGroup);
        sb.append(", systemPermission='").append(systemPermission).append('\'');
        sb.append(", permissionType='").append(permissionType).append('\'');
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append('}');
        return sb.toString();
    }
}
