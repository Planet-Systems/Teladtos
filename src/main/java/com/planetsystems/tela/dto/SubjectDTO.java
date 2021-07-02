package com.planetsystems.tela.dto;

public class SubjectDTO extends  ParentDTO {
    private String code;
    private String name;
    private SubjectCategoryDTO subjectCategoryDTO;

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

    public SubjectCategoryDTO getSubjectCategoryDTO() {
        return subjectCategoryDTO;
    }

    public void setSubjectCategoryDTO(SubjectCategoryDTO subjectCategoryDTO) {
        this.subjectCategoryDTO = subjectCategoryDTO;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SubjectDTO{");
        sb.append("code='").append(code).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", subjectCategoryDTO=").append(subjectCategoryDTO);
        sb.append('}');
        return sb.toString();
    }
}
