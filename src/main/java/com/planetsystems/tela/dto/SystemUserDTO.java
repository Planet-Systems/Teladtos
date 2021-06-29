package com.planetsystems.tela.dto;

public class SystemUserDTO extends ParentDTO {
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private boolean enabled;
	private String configRole;

	public SystemUserDTO() {
	}

	public SystemUserDTO(String id) {
		super(id);
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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getConfigRole() {
		return configRole;
	}

	public void setConfigRole(String configRole) {
		this.configRole = configRole;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("SystemUserDTO{");
		sb.append("userName='").append(userName).append('\'');
		sb.append(", password='").append(password).append('\'');
		sb.append(", enabled=").append(enabled);
		sb.append(", configRole='").append(configRole).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
