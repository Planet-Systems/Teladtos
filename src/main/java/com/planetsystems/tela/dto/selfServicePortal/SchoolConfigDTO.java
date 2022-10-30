package com.planetsystems.tela.dto.selfServicePortal;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.planetsystems.tela.dto.AcademicTermDTO;
import com.planetsystems.tela.dto.SchoolDTO;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(value=Include.NON_NULL)
public class SchoolConfigDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SchoolDTO school;
	private AcademicTermDTO academicTerm;

	public SchoolConfigDTO() {

	}

	public SchoolDTO getSchool() {
		return school;
	}

	public void setSchool(SchoolDTO school) {
		this.school = school;
	}

	public AcademicTermDTO getAcademicTerm() {
		return academicTerm;
	}

	public void setAcademicTerm(AcademicTermDTO academicTerm) {
		this.academicTerm = academicTerm;
	}
	
	

}
