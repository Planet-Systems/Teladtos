package com.planetsystems.tela.dto.enums;

public enum OrphanCategory {
 
	FULL("Maternal orphan"),
	HALF("Paternal orphan"),
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
