package com.planetsystems.tela.dto;

public class SubjectCategoryDTO extends ParentDTO {
    private String code;
    private String name;

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

    @Override
    public String toString() {
        return "SubjectCategoryDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
