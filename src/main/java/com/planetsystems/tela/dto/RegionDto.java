package com.planetsystems.tela.dto;

public class RegionDto extends ParentDTO {
    private String code;
    private String name;

    public RegionDto() {
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
}
