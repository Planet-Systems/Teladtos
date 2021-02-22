package com.planetsystems.tela.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ParentDTO implements Serializable {
    private String id;

    private String dateCreated;
    private String dateUpdated;
    private String status;

    public ParentDTO() {
    }

    public ParentDTO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ParentDTO{" +
                "id='" + id + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                ", dateUpdated='" + dateUpdated + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
