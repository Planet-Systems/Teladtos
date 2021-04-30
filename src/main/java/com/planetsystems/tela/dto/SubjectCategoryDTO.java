package com.planetsystems.tela.dto;

import java.util.List;

public class SubjectCategoryDTO extends ParentDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
	private String name;

	public SubjectCategoryDTO() {
	}

	public SubjectCategoryDTO(String id) {
		super(id);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
