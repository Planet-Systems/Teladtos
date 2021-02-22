package com.planetsystems.tela.dto;

public class RegionDto extends ParentDTO {
    private String code;
    private String name;

    public RegionDto() {
    }

    public RegionDto(String id) {
        super(id);
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RegionDto{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
