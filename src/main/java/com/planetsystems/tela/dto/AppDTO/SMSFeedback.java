package com.planetsystems.tela.dto.AppDTO;

import java.io.Serializable;

public class SMSFeedback implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String recipient;
	private String cost;
	private String status;
	private String statusCode;
	private String ms;

	public SMSFeedback() {

	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMs() {
		return ms;
	}

	public void setMs(String ms) {
		this.ms = ms;
	}

}
