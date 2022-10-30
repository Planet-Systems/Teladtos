package com.planetsystems.tela.dto;

import java.io.Serializable;
import java.util.List;

public class ActionDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String requiredAction;
	private String actionValue;
	private List<String> affectedEntities;

	public String getRequiredAction() {
		return requiredAction;
	}

	public void setRequiredAction(String requiredAction) {
		this.requiredAction = requiredAction;
	}

	public String getActionValue() {
		return actionValue;
	}

	public void setActionValue(String actionValue) {
		this.actionValue = actionValue;
	}

	public List<String> getAffectedEntities() {
		return affectedEntities;
	}

	public void setAffectedEntities(List<String> affectedEntities) {
		this.affectedEntities = affectedEntities;
	}

}
