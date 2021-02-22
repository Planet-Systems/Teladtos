package com.planetsystems.tela.dto;

public class SchoolClassDTO extends ParentDTO {
    private String code;
    private String name;
    private SchoolDTO school;
    private AcademicTermDTO  academicTerm;

    public SchoolClassDTO() {
    }

    public SchoolClassDTO(String id) {
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

    public SchoolDTO getSchool() {
        return school;
    }

    public void setSchool(SchoolDTO school) {
        this.school = school;
    }

    public AcademicTermDTO getAcademicTerm() {
        return academicTerm;
    }

    public void setAcademicTerm(AcademicTermDTO academicTerm) {
        this.academicTerm = academicTerm;
    }

    @Override
    public String toString() {
        return "SchoolClassDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", school=" + school +
                ", academicTerm=" + academicTerm +
                '}';
    }
}
