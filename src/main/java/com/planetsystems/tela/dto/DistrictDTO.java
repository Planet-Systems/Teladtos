package com.planetsystems.tela.dto;

public class DistrictDTO extends ParentDTO {
    private RegionDto region;
    private String name;
    private String code;
    private boolean rolledOut;

    public DistrictDTO() {
    }

    public RegionDto getRegion() {
        return region;
    }

    public void setRegion(RegionDto region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isRolledOut() {
        return rolledOut;
    }

    public void setRolledOut(boolean rolledOut) {
        this.rolledOut = rolledOut;
    }
}
