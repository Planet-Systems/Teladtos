package com.planetsystems.tela.dto;

import java.io.Serializable;

public class AuthenticationDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;


	public AuthenticationDTO() {
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AuthenticationDTO{" +
				"userName='" + userName + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
