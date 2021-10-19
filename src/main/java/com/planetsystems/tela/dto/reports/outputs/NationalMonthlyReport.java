package com.planetsystems.tela.dto.reports.outputs;

import java.io.Serializable;
import java.util.List;

public class NationalMonthlyReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String academicYear;
	private String term;
	private String month;

	private List<NationalMonthlyReportInput> mrow_inputs;

	public NationalMonthlyReport() {

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

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public List<NationalMonthlyReportInput> getMrow_inputs() {
		return mrow_inputs;
	}

	public void setMrow_inputs(List<NationalMonthlyReportInput> mrow_inputs) {
		this.mrow_inputs = mrow_inputs;
	}

}
