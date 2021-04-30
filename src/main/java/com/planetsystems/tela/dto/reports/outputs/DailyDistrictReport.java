package com.planetsystems.tela.dto.reports.outputs;

import java.io.Serializable;
import java.util.List;

public class DailyDistrictReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String academicYear;
	private String term;
	private String district;
	private String fromDate;
	private String toDate;

	private List<DailyDistrictInput> mrow_inputs;

	public DailyDistrictReport() {

	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public List<DailyDistrictInput> getMrow_inputs() {
		return mrow_inputs;
	}

	public void setMrow_inputs(List<DailyDistrictInput> mrow_inputs) {
		this.mrow_inputs = mrow_inputs;
	}
	
	

}
