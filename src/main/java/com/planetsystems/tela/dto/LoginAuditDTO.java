package com.planetsystems.tela.dto;

import java.io.Serializable; 
 

public class LoginAuditDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String systemUser;
	private String loginTime;
	
	public LoginAuditDTO() {
		
	}

	public String getSystemUser() {
		return systemUser;
	}

	public void setSystemUser(String systemUser) {
		this.systemUser = systemUser;
	}

	public String getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	
	

}
