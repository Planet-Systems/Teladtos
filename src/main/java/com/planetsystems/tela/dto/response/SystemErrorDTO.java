package com.planetsystems.tela.dto.response;

import java.io.Serializable;

@Deprecated
public class SystemErrorDTO implements Serializable {
    private String message;
    private int errorCode;

    public SystemErrorDTO() {
        this.message = "An error occurred while initiating transaction. Please try again";
    }

    public SystemErrorDTO(String message, int errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SystemErrorDTO{");
        sb.append("message='").append(message).append('\'');
        sb.append(", errorCode=").append(errorCode);
        sb.append('}');
        return sb.toString();
    }
}
