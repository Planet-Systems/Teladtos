package com.planetsystems.tela.dto.externalIntegration;

import java.io.Serializable;

public class ExEndTermDistrictReportDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String schoolCode;
	private String shoolName;

	private String month1;
	private String month2;
	private String month3;

	private double totalHours;
	private double expectedHours;
	private double percentage;
	private double variance;

	public ExEndTermDistrictReportDTO() {

	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getShoolName() {
		return shoolName;
	}

	public void setShoolName(String shoolName) {
		this.shoolName = shoolName;
	}

	public String getMonth1() {
		return month1;
	}

	public void setMonth1(String month1) {
		this.month1 = month1;
	}

	public String getMonth2() {
		return month2;
	}

	public void setMonth2(String month2) {
		this.month2 = month2;
	}

	public String getMonth3() {
		return month3;
	}

	public void setMonth3(String month3) {
		this.month3 = month3;
	}

	public double getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(double totalHours) {
		this.totalHours = totalHours;
	}

	public double getExpectedHours() {
		return expectedHours;
	}

	public void setExpectedHours(double expectedHours) {
		this.expectedHours = expectedHours;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public double getVariance() {
		return variance;
	}

	public void setVariance(double variance) {
		this.variance = variance;
	}

}
