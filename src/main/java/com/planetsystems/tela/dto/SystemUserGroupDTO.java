package com.planetsystems.tela.dto;

public class SystemUserGroupDTO extends ParentDTO {
    private String code;
    private String name;
    private String description;
    private boolean defaultGroup = false;
    private boolean receiveAlerts = false;
    private SystemUserDTO createdBy;
    private SystemUserDTO updatedBy;

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
        return "SystemUserGroupDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", defaultGroup=" + defaultGroup +
                ", receiveAlerts=" + receiveAlerts +
                ", createdBy=" + createdBy +
                ", updatedBy=" + updatedBy +
                '}';
    }
}
