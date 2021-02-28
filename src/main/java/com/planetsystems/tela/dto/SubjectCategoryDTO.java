package com.planetsystems.tela.dto;

import java.util.List;

public class SubjectCategoryDTO extends ParentDTO {
    private String code;
    private String name;
    private List<SubjectDTO> subjectDTOList;

    public SubjectCategoryDTO() {
    }

    public SubjectCategoryDTO(String id) {
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

    public List<SubjectDTO> getSubjectDTOList() {
        return subjectDTOList;
    }

    public void setSubjectDTOList(List<SubjectDTO> subjectDTOList) {
        this.subjectDTOList = subjectDTOList;
    }

    @Override
    public String toString() {
        return "SubjectCategoryDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", subjectDTOList=" + subjectDTOList +
                '}';
    }
}
