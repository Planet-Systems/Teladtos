package com.planetsystems.tela.dto.AppDTO;

import java.io.Serializable;

public class SystemAppFeedBack <T> implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
    private T data;
    private boolean status;

    public SystemAppFeedBack() {
        this.message = "An Error occurred while initiating Transaction";
        this.status = false;
    }

    public SystemAppFeedBack(String message, T data, boolean status) {
        this.message = message;
        this.data = data;
        this.status = status;
    }

    public SystemAppFeedBack(T data, boolean status) {
        this.data = data;
        this.status = status;
    }

    public SystemAppFeedBack(T data) {
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
