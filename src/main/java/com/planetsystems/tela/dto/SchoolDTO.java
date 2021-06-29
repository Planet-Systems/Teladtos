package com.planetsystems.tela.dto;

public class SchoolDTO extends ParentDTO{
    private String code;
    private String name;

    private SchoolCategoryDTO schoolCategoryDTO;

    private String latitude;
    private String longitude;

    private DistrictDTO districtDTO;

    private String deviceNumber; // Phone Serial number

    private boolean attendanceTracked = true;

    private String activationStatus;

    public SchoolDTO() {
    }

    public SchoolDTO(String id) {
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

    public SchoolCategoryDTO getSchoolCategoryDTO() {
        return schoolCategoryDTO;
    }

    public void setSchoolCategoryDTO(SchoolCategoryDTO schoolCategoryDTO) {
        this.schoolCategoryDTO = schoolCategoryDTO;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public DistrictDTO getDistrictDTO() {
        return districtDTO;
    }

    public void setDistrictDTO(DistrictDTO districtDTO) {
        this.districtDTO = districtDTO;
    }

    public String getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public boolean isAttendanceTracked() {
        return attendanceTracked;
    }

    public void setAttendanceTracked(boolean attendanceTracked) {
        this.attendanceTracked = attendanceTracked;
    }

    public String getActivationStatus() {
        return activationStatus;
    }

    public void setActivationStatus(String activationStatus) {
        this.activationStatus = activationStatus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SchoolDTO{");
        sb.append("code='").append(code).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", schoolCategoryDTO=").append(schoolCategoryDTO);
        sb.append(", latitude='").append(latitude).append('\'');
        sb.append(", longitude='").append(longitude).append('\'');
        sb.append(", districtDTO=").append(districtDTO);
        sb.append(", deviceNumber='").append(deviceNumber).append('\'');
        sb.append(", attendanceTracked=").append(attendanceTracked);
        sb.append(", activationStatus='").append(activationStatus).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
