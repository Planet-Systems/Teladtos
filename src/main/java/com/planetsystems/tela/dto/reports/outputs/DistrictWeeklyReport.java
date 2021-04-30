/**
 * 
 */
package com.planetsystems.tela.dto.reports.outputs;

import java.io.Serializable;
import java.util.List;

/**
 * @author wahabu
 *
 */
public class DistrictWeeklyReport implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String academicYear;
	private String district;
	private String term;
	private String month;

	private List<MonthlySchoolInput> mrow_inputs;

	public DistrictWeeklyReport() {

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

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public List<MonthlySchoolInput> getMrow_inputs() {
		return mrow_inputs;
	}

	public void setMrow_inputs(List<MonthlySchoolInput> mrow_inputs) {
		this.mrow_inputs = mrow_inputs;
	}

}
