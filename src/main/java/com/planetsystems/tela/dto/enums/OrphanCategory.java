package com.planetsystems.tela.dto.enums;

public enum OrphanCategory {
 
	FULL("Full Orphan"),
	HALF("Half Orphan"),
	NOT("Not Orphan");

	private String category;

	OrphanCategory(String category) {
		this.category = category;
	}

	public String getOrphanCategory() {
		return category;
	}

	public void setOrphanCategory(String category) {
		this.category = category;
	}

	public static OrphanCategory getOrphanCategory(String category) {
		for (OrphanCategory relationShip : OrphanCategory.values()) {
			if (relationShip.getOrphanCategory().equalsIgnoreCase(category)) {
				return relationShip;
			}
		}
		return null;
	}
 

}
