package com.planetsystems.tela.dto.dashboard;

import java.io.Serializable;

public class DataOutPutByGenderDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String key;
	private long male;
	private long female;

	private double percentMale;
	private double pecentFemale;

	public DataOutPutByGenderDTO() {

	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public long getMale() {
		return male;
	}

	public void setMale(long male) {
		this.male = male;
	}

	public long getFemale() {
		return female;
	}

	public void setFemale(long female) {
		this.female = female;
	}

	public double getPercentMale() {
		return percentMale;
	}

	public void setPercentMale(double percentMale) {
		this.percentMale = percentMale;
	}

	public double getPecentFemale() {
		return pecentFemale;
	}

	public void setPecentFemale(double pecentFemale) {
		this.pecentFemale = pecentFemale;
	}

}
