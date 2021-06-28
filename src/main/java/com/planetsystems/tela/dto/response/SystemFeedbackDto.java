package com.planetsystems.tela.dto.response;

import java.io.Serializable;

public class SystemFeedbackDto<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	private String message;
	private boolean status;
	private T data;

	public SystemFeedbackDto() {
		this.message = "An error occurred while initiating transaction. Please try again";
		this.status = false;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
