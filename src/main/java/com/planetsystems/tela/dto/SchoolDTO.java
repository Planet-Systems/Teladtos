package com.planetsystems.tela.dto;

public class SchoolDTO extends ParentDTO{
    private String code;
    private String name;
    private String location;
    private SchoolCategoryDTO schoolCategory;

    private String latitude;
    private String longitude;

    private DistrictDTO district;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public SchoolCategoryDTO getSchoolCategory() {
        return schoolCategory;
    }

    public void setSchoolCategory(SchoolCategoryDTO schoolCategory) {
        this.schoolCategory = schoolCategory;
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

    public DistrictDTO getDistrict() {
        return district;
    }

    public void setDistrict(DistrictDTO district) {
        this.district = district;
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
        return "SchoolDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", schoolCategory=" + schoolCategory +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", district=" + district +
                ", deviceNumber='" + deviceNumber + '\'' +
                ", attendanceTracked=" + attendanceTracked +
                ", activationStatus='" + activationStatus + '\'' +
                '}';
    }
}
