package com.planetsystems.tela.dto;

public class AbsentDTO extends ParentDTO{

    private AcademicTermDTO academicTermDTO;

    private SchoolStaffDTO schoolStaffDTO;

    private SchoolDTO schoolDTO;

    private String comment;
    private String latitude;
    private String longitude;
    private String status;

    public AcademicTermDTO getAcademicTermDTO() {
        return academicTermDTO;
    }

    public void setAcademicTermDTO(AcademicTermDTO academicTermDTO) {
        this.academicTermDTO = academicTermDTO;
    }

    public SchoolStaffDTO getSchoolStaffDTO() {
        return schoolStaffDTO;
    }

    public void setSchoolStaffDTO(SchoolStaffDTO schoolStaffDTO) {
        this.schoolStaffDTO = schoolStaffDTO;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    public SchoolDTO getSchoolDTO() {
		return schoolDTO;
	}

	public void setSchoolDTO(SchoolDTO schoolDTO) {
		this.schoolDTO = schoolDTO;
	}

    @Override
    public String toString() {
        return "AbsentDTO{" +
                "academicTermDTO=" + academicTermDTO +
                ", schoolStaffDTO=" + schoolStaffDTO +
                ", schoolDTO=" + schoolDTO +
                ", comment='" + comment + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
