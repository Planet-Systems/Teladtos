package com.planetsystems.tela.dto.response;

import java.io.Serializable;

public class SystemResponseDTO<T> implements Serializable {
    private String message;
    private boolean status;
    private T data;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SystemResponseDTO{");
        sb.append("message='").append(message).append('\'');
        sb.append(", data=").append(data);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
