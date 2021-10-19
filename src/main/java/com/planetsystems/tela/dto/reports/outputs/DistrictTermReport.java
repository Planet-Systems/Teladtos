package com.planetsystems.tela.dto.reports.outputs;

import java.io.Serializable;
import java.util.List;

public class DistrictTermReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String academicYear;
	private String district;
	private String term;

	private List<DistrictTermInput> mrow_inputs;

	public DistrictTermReport() {

	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public List<DistrictTermInput> getMrow_inputs() {
		return mrow_inputs;
	}

	public void setMrow_inputs(List<DistrictTermInput> mrow_inputs) {
		this.mrow_inputs = mrow_inputs;
	}

}
