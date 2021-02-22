package com.planetsystems.tela.dto;

import io.swagger.annotations.ApiModel;

@ApiModel("System user dto details")
public class SystemUserDTO extends ParentDTO{
    private String userName;
    private String password;
    private boolean enabled = true;
    private String configRole;
    //private SystemUserDTO createdBy;
    //private SystemUserDTO updatedBy;

    public SystemUserDTO() {
    }

    public SystemUserDTO(String id) {
        super(id);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getConfigRole() {
        return configRole;
    }

    public void setConfigRole(String configRole) {
        this.configRole = configRole;
    }

//    public SystemUserDTO getCreatedBy() {
//        return createdBy;
//    }
//
//    public void setCreatedBy(SystemUserDTO createdBy) {
//        this.createdBy = createdBy;
//    }

//    public SystemUserDTO getUpdatedBy() {
//        return updatedBy;
//    }
//
//    public void setUpdatedBy(SystemUserDTO updatedBy) {
//        this.updatedBy = updatedBy;
//    }

    @Override
    public String toString() {
        return "SystemUserDTO{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", configRole='" + configRole + '\'' +
                '}';
    }
}
