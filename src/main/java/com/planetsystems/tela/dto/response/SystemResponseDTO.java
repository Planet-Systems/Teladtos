package com.planetsystems.tela.dto.response;

import java.io.Serializable;

@Deprecated
public class SystemResponseDTO<T> implements Serializable {
    private String message;
    private T data;
    private boolean status;

    public SystemResponseDTO() {
        this.message = "An Error occurred while initiating Transaction";
        this.status = false;
    }

    public SystemResponseDTO(String message, T data, boolean status) {
        this.message = message;
        this.data = data;
        this.status = status;
    }

    public SystemResponseDTO(T data, boolean status) {
        this.data = data;
        this.status = status;
    }

    public SystemResponseDTO(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
