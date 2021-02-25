package com.planetsystems.tela.dto;

import java.util.Date;

public class GeneralUserDetailDTO extends ParentDTO {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String dob;
    private String nationalId;
    private String gender;
    private String nameAbrev;
    public GeneralUserDetailDTO() {
    }

    public GeneralUserDetailDTO(String id) {
        super(id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNameAbrev() {
        return nameAbrev;
    }

    public void setNameAbrev(String nameAbrev) {
        this.nameAbrev = nameAbrev;
    }


    @Override
    public String toString() {
        return "GeneralUserDetailDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", nationalId='" + nationalId + '\'' +
                ", gender='" + gender + '\'' +
                ", nameAbrev='" + nameAbrev + '\'' +
                '}';
    }
}
