package com.planetsystems.tela.dto;

public class SchoolStaffDTO extends ParentDTO {
    private GeneralUserDetailDTO generalUserDetail;
    private String staffCode;
    private String staffType;
    private SchoolDTO  school;
    private boolean registered;

    public SchoolStaffDTO() {
    }

    public SchoolStaffDTO(String id) {
        super(id);
    }

    public GeneralUserDetailDTO getGeneralUserDetail() {
        return generalUserDetail;
    }

    public void setGeneralUserDetail(GeneralUserDetailDTO generalUserDetail) {
        this.generalUserDetail = generalUserDetail;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }

    public SchoolDTO getSchool() {
        return school;
    }

    public void setSchool(SchoolDTO school) {
        this.school = school;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    @Override
    public String toString() {
        return "SchoolStaffDTO{" +
                "generalUserDetail=" + generalUserDetail +
                ", staffCode='" + staffCode + '\'' +
                ", staffType='" + staffType + '\'' +
                ", school=" + school +
                ", registered=" + registered +
                '}';
    }
}
