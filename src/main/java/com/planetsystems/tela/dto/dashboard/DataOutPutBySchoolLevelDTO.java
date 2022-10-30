package com.planetsystems.tela.dto.dashboard;

import java.io.Serializable;

public class DataOutPutBySchoolLevelDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String key;
	private long primary;
	private long secondary;
	private long institutions;

	private double percentPrimary;
	private double pecentSecondary;
	private double pecentInstitutions;

	public DataOutPutBySchoolLevelDTO() {

	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public long getPrimary() {
		return primary;
	}

	public void setPrimary(long primary) {
		this.primary = primary;
	}

	public long getSecondary() {
		return secondary;
	}

	public void setSecondary(long secondary) {
		this.secondary = secondary;
	}

	public long getInstitutions() {
		return institutions;
	}

	public void setInstitutions(long institutions) {
		this.institutions = institutions;
	}

	public double getPercentPrimary() {
		return percentPrimary;
	}

	public void setPercentPrimary(double percentPrimary) {
		this.percentPrimary = percentPrimary;
	}

	public double getPecentSecondary() {
		return pecentSecondary;
	}

	public void setPecentSecondary(double pecentSecondary) {
		this.pecentSecondary = pecentSecondary;
	}

	public double getPecentInstitutions() {
		return pecentInstitutions;
	}

	public void setPecentInstitutions(double pecentInstitutions) {
		this.pecentInstitutions = pecentInstitutions;
	}

}
