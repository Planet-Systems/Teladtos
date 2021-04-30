package com.planetsystems.tela.dto.reports.outputs;

import java.io.Serializable;
import java.util.List;

public class NationalTermlyReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String academicYear;
	private String term;
	private List<NationalTermlyReportInput> mrow_inputs;

	public NationalTermlyReport() {

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

	public List<NationalTermlyReportInput> getMrow_inputs() {
		return mrow_inputs;
	}

	public void setMrow_inputs(List<NationalTermlyReportInput> mrow_inputs) {
		this.mrow_inputs = mrow_inputs;
	}

}
