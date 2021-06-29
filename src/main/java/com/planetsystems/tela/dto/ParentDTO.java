package com.planetsystems.tela.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ParentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
    private String createdDateTime;
    private String updatedDateTime;
    private String status;

    public ParentDTO() {
    }

    public ParentDTO(String id) {
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(String updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ParentDTO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", createdDateTime='").append(createdDateTime).append('\'');
        sb.append(", updatedDateTime='").append(updatedDateTime).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
