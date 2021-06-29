package com.planetsystems.tela.dto;

public class GeneralUserDetailDTO extends ParentDTO {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String dob;
    private String nationalId;
    private String gender;
    private String nameAbbrev;

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

    public String getNameAbbrev() {
        return nameAbbrev;
    }

    public void setNameAbbrev(String nameAbbrev) {
        this.nameAbbrev = nameAbbrev;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GeneralUserDetailDTO{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", dob='").append(dob).append('\'');
        sb.append(", nationalId='").append(nationalId).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", nameAbbrev='").append(nameAbbrev).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
