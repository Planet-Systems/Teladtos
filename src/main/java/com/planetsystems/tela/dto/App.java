package com.planetsystems.tela.dto;

public class App {
	public static void main(String[] args) throws Exception {
		AbsentDTO x = new AbsentDTO();
		SchoolDTO schoolDTO = new SchoolDTO();
		schoolDTO.setId("re");
		x.setSchoolDTO(schoolDTO);

		System.out.println(x);
	}

}
