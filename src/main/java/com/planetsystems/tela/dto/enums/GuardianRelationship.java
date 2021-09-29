package com.planetsystems.tela.dto.enums;
 

public enum GuardianRelationship {

	FATHER("Father"),
	MOTHER("Mother"),
	UNCLE("Uncle"),
	AUNT("Aunt"),
	BROTHER("Brother"),
	SISTER("Sister");

	private String relationShip;

	GuardianRelationship(String relationShip) {
		this.relationShip = relationShip;
	}

	public String getRelationShip() {
		return relationShip;
	}

	public void setRelationShip(String relationShip) {
		this.relationShip = relationShip;
	}

	public static GuardianRelationship getRelationShip(String relationShip) {
		for (GuardianRelationship rel : GuardianRelationship.values()) {
			if (rel.getRelationShip().equalsIgnoreCase(relationShip)) {
				return rel;
			}
		}
		return null;
	}
 
}
