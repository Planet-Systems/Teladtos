package com.planetsystems.tela.dto.response;

import java.io.Serializable;

@Deprecated
public class SystemFeedbackDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String message;
	private String id;
	private boolean response;

	public SystemFeedbackDTO() {
		this.message = "An error occurred while initiating transaction. Please try again";
		this.response = false;
	}

	public SystemFeedbackDTO(boolean response, String message) {
		this.message = message;
		this.response = response;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isResponse() {
		return response;
	}

	public void setResponse(boolean response) {
		this.response = response;
	}
}
