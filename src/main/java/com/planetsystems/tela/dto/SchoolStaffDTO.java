package com.planetsystems.tela.dto;


public class SchoolStaffDTO extends ParentDTO {
    private String staffCode;
    private String staffType;
    private boolean registered;
    private GeneralUserDetailDTO generalUserDetailDTO;
    private SchoolDTO schoolDTO;

    public SchoolStaffDTO() {
    }

    public SchoolStaffDTO(String id) {
        super(id);
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

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public GeneralUserDetailDTO getGeneralUserDetailDTO() {
        return generalUserDetailDTO;
    }

    public void setGeneralUserDetailDTO(GeneralUserDetailDTO generalUserDetailDTO) {
        this.generalUserDetailDTO = generalUserDetailDTO;
    }

    public SchoolDTO getSchoolDTO() {
        return schoolDTO;
    }

    public void setSchoolDTO(SchoolDTO schoolDTO) {
        this.schoolDTO = schoolDTO;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SchoolStaffDTO{");
        sb.append("staffCode='").append(staffCode).append('\'');
        sb.append(", staffType='").append(staffType).append('\'');
        sb.append(", registered=").append(registered);
        sb.append(", generalUserDetailDTO=").append(generalUserDetailDTO);
        sb.append(", schoolDTO=").append(schoolDTO);
        sb.append('}');
        return sb.toString();
    }
}
