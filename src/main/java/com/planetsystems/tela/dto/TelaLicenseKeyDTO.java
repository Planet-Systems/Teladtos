package com.planetsystems.tela.dto;

public class TelaLicenseKeyDTO extends ParentDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String licenseKey;
	private String product;
	private String productVersion;
	private String validity;
	private String activations;
	private String licenseStatus;
	private String expirationDate;

	public TelaLicenseKeyDTO() {

	}

	public String getLicenseKey() {
		return licenseKey;
	}

	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public String getActivations() {
		return activations;
	}

	public void setActivations(String activations) {
		this.activations = activations;
	}

	public String getLicenseStatus() {
		return licenseStatus;
	}

	public void setLicenseStatus(String licenseStatus) {
		this.licenseStatus = licenseStatus;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

}
