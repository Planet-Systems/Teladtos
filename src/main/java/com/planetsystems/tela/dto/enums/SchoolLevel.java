package com.planetsystems.tela.dto.enums;

public enum SchoolLevel {

	PRIMARY("Primary"), SECONDARY("Secondary"), CAI("Cerficate Awarding Institutions");

	private String level;

	SchoolLevel(String level) {
		this.level = level;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public static SchoolLevel getSchoolLevel(String level) {
		for (SchoolLevel schoolLevel : SchoolLevel.values()) {
			if (schoolLevel.getLevel().equalsIgnoreCase(level)) {
				return schoolLevel;
			}
		}
		return null;
	}

}
