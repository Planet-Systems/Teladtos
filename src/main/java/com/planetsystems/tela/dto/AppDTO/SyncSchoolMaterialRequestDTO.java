package com.planetsystems.tela.dto.AppDTO;

import java.io.Serializable;

public class SyncSchoolMaterialRequestDTO implements Serializable{
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String staffCode; 
	private String schoolClass; 
	private String itemId; 
	private float quantity;
	private String dateRequired;
	private String requestDate; 
	private String comment;
	
	private String localId;
	private boolean deleted;
	private boolean updated;
	private boolean created;
	
	public SyncSchoolMaterialRequestDTO() {
		
	}

	public String getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(String staffCode) {
		this.staffCode = staffCode;
	}

	public String getSchoolClass() {
		return schoolClass;
	}

	public void setSchoolClass(String schoolClass) {
		this.schoolClass = schoolClass;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public String getDateRequired() {
		return dateRequired;
	}

	public void setDateRequired(String dateRequired) {
		this.dateRequired = dateRequired;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String requestDate) {
		this.requestDate = requestDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getLocalId() {
		return localId;
	}

	public void setLocalId(String localId) {
		this.localId = localId;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public boolean isUpdated() {
		return updated;
	}

	public void setUpdated(boolean updated) {
		this.updated = updated;
	}

	public boolean isCreated() {
		return created;
	}

	public void setCreated(boolean created) {
		this.created = created;
	}
	
	

}
