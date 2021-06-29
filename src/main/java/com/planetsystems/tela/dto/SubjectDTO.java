package com.planetsystems.tela.dto;

public class SubjectDTO extends  ParentDTO {
    private String code;
    private String name;
    private SubjectCategoryDTO subjectCategory;

    public SubjectDTO() {
    }

    public SubjectDTO(String id) {
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

    public SubjectCategoryDTO getSubjectCategory() {
        return subjectCategory;
    }

    public void setSubjectCategory(SubjectCategoryDTO subjectCategory) {
        this.subjectCategory = subjectCategory;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SubjectDTO{");
        sb.append("code='").append(code).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", subjectCategory=").append(subjectCategory);
        sb.append('}');
        return sb.toString();
    }
}
