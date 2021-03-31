package com.planetsystems.tela.dto;
import java.io.Serializable;


public class TokenFeedbackDTO implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String message;
	private String token;
	private boolean response;
	  
	public TokenFeedbackDTO() {
		this.message = "An error occurred while creating authorization token. Please try again";
		this.response = false;
	}

	public TokenFeedbackDTO(boolean response, String message) {
		this.message = message;
		this.response = response;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isResponse() {
		return response;
	}

	public void setResponse(boolean response) {
		this.response = response;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "TokenFeedbackDTO{" +
				"message='" + message + '\'' +
				", token='" + token + '\'' +
				", response=" + response +
				'}';
	}
}
