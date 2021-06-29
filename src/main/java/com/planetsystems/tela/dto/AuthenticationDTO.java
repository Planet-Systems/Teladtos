package com.planetsystems.tela.dto;


import java.io.Serializable;
public class AuthenticationDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	private String oldPassword;

	public AuthenticationDTO() {
	}



	public static long getSerialVersionUID() {
		return serialVersionUID;
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

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("AuthenticationDTO{");
		sb.append("userName='").append(userName).append('\'');
		sb.append(", password='").append(password).append('\'');
		sb.append(", oldPassword='").append(oldPassword).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
