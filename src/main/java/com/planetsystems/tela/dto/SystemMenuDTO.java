package com.planetsystems.tela.dto;

import com.planetsystems.tela.dto.enums.NavigationMenu;
import com.planetsystems.tela.dto.enums.SubMenuItem;

import java.util.ArrayList;
import java.util.List;

public class SystemMenuDTO extends ParentDTO {
	private static final long serialVersionUID = 1L;
	private String navigationMenu;
	private String subMenuItem;
	private String activativationSatus;

	public SystemMenuDTO(String navigationMenu, String subMenuItem) {
		this.navigationMenu = navigationMenu;
		this.subMenuItem = subMenuItem;
	}

	public static List<SystemMenuDTO> systemMenuDTOList(){
		//creating system menus
		List<SystemMenuDTO> configurationSideNavMenu = new ArrayList<>();
		configurationSideNavMenu.add(new SystemMenuDTO(NavigationMenu.SYSTEM_CONFIGURATION.getNavigationMenu() , SubMenuItem.Dashboard.getSystemMenuItem()));
		configurationSideNavMenu.add(new SystemMenuDTO(NavigationMenu.SYSTEM_CONFIGURATION.getNavigationMenu() , SubMenuItem.AcademicYear.getSystemMenuItem()));
		configurationSideNavMenu.add( new SystemMenuDTO(NavigationMenu.SYSTEM_CONFIGURATION.getNavigationMenu() , SubMenuItem.Location.getSystemMenuItem()));
		configurationSideNavMenu.add(new SystemMenuDTO(NavigationMenu.SYSTEM_CONFIGURATION.getNavigationMenu() , SubMenuItem.Schools.getSystemMenuItem()));
		configurationSideNavMenu.add(new SystemMenuDTO(NavigationMenu.SYSTEM_CONFIGURATION.getNavigationMenu() , SubMenuItem.Subjects.getSystemMenuItem()));

		List<SystemMenuDTO> enrollmentSidNavMenu = new ArrayList<>();
		enrollmentSidNavMenu.add(new SystemMenuDTO(NavigationMenu.ENROLLMENT.getNavigationMenu() , SubMenuItem.Learner_Enrollement.getSystemMenuItem()));
		enrollmentSidNavMenu.add(new SystemMenuDTO(NavigationMenu.ENROLLMENT.getNavigationMenu() , SubMenuItem.Staff_Enrollement.getSystemMenuItem()));

		List<SystemMenuDTO> attendanceSidNavMenu = new ArrayList<>();
		attendanceSidNavMenu.add(new SystemMenuDTO(NavigationMenu.ATTENDANCE.getNavigationMenu() , SubMenuItem.Learner_Attendance.getSystemMenuItem() ));
		attendanceSidNavMenu.add(new SystemMenuDTO(NavigationMenu.ATTENDANCE.getNavigationMenu() , SubMenuItem.Staff_Attendance.getSystemMenuItem() ));
		//attendanceSidNavMenu.add(new SystemMenuDTO(NavigationMenu.ATTENDANCE.getNavigationMenu() , SubMenuItem.Staff_Daily_Task.getSystemMenuItem()));
		attendanceSidNavMenu.add(new SystemMenuDTO(NavigationMenu.ATTENDANCE.getNavigationMenu() , SubMenuItem.Head_Teacher_Supervision.getSystemMenuItem() ));

		List<SystemMenuDTO> timetableSidNavMenu = new ArrayList();
		timetableSidNavMenu.add(new SystemMenuDTO(NavigationMenu.TIMETABLE.getNavigationMenu() , SubMenuItem.TimeTable.getSystemMenuItem()));

		List<SystemMenuDTO> systemUserSidNavMenu = new ArrayList();
		timetableSidNavMenu.add(new SystemMenuDTO(NavigationMenu.SYSTEM_USERS.getNavigationMenu() , SubMenuItem.Users.getSystemMenuItem()));

		List<SystemMenuDTO> reports = new ArrayList<>();
		reports.add(new SystemMenuDTO(NavigationMenu.GENERATE_REPORTS.getNavigationMenu(), SubMenuItem.School_Performace.getSystemMenuItem()));
		reports.add(new SystemMenuDTO(NavigationMenu.GENERATE_REPORTS.getNavigationMenu(), SubMenuItem.District_Reports.getSystemMenuItem()));
		reports.add(new SystemMenuDTO(NavigationMenu.GENERATE_REPORTS.getNavigationMenu(), SubMenuItem.National_Reports.getSystemMenuItem()));
		
		
		/*List<SystemMenuDTO> incentives = new ArrayList<>();
		incentives.add(new SystemMenuDTO(NavigationMenu.INCENTIVES.getNavigationMenu(), SubMenuItem.School_Performace.getSystemMenuItem()));
		incentives.add(new SystemMenuDTO(NavigationMenu.INCENTIVES.getNavigationMenu(), SubMenuItem.District_Reports.getSystemMenuItem()));
		incentives.add(new SystemMenuDTO(NavigationMenu.INCENTIVES.getNavigationMenu(), SubMenuItem.National_Reports.getSystemMenuItem()));
		
		
		List<SystemMenuDTO> curriculumCoverage = new ArrayList<>();
		curriculumCoverage.add(new SystemMenuDTO(NavigationMenu.CURRICULUM_COVERAGE.getNavigationMenu(), SubMenuItem.School_Performace.getSystemMenuItem()));
		curriculumCoverage.add(new SystemMenuDTO(NavigationMenu.CURRICULUM_COVERAGE.getNavigationMenu(), SubMenuItem.District_Reports.getSystemMenuItem()));
		curriculumCoverage.add(new SystemMenuDTO(NavigationMenu.CURRICULUM_COVERAGE.getNavigationMenu(), SubMenuItem.National_Reports.getSystemMenuItem()));
		
		List<SystemMenuDTO> utilityManager = new ArrayList<>();
		utilityManager.add(new SystemMenuDTO(NavigationMenu.UTILITY_MANAGER.getNavigationMenu(), SubMenuItem.School_Performace.getSystemMenuItem()));
		utilityManager.add(new SystemMenuDTO(NavigationMenu.UTILITY_MANAGER.getNavigationMenu(), SubMenuItem.District_Reports.getSystemMenuItem()));
		utilityManager.add(new SystemMenuDTO(NavigationMenu.UTILITY_MANAGER.getNavigationMenu(), SubMenuItem.National_Reports.getSystemMenuItem()));*/


		List<SystemMenuDTO> systemMenuDTOList = new ArrayList<>();
		systemMenuDTOList.addAll(configurationSideNavMenu);
		systemMenuDTOList.addAll(attendanceSidNavMenu);
		systemMenuDTOList.addAll(enrollmentSidNavMenu);
		systemMenuDTOList.addAll(timetableSidNavMenu);
		systemMenuDTOList.addAll(systemUserSidNavMenu);
		
		//systemMenuDTOList.addAll(incentives);
		//systemMenuDTOList.addAll(curriculumCoverage);
		//systemMenuDTOList.addAll(utilityManager);
		
		systemMenuDTOList.addAll(reports);
		
		return systemMenuDTOList;
	}


	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getNavigationMenu() {
		return navigationMenu;
	}

	public void setNavigationMenu(String navigationMenu) {
		this.navigationMenu = navigationMenu;
	}

	public String getSubMenuItem() {
		return subMenuItem;
	}

	public void setSubMenuItem(String subMenuItem) {
		this.subMenuItem = subMenuItem;
	}

	public String getActivativationSatus() {
		return activativationSatus;
	}

	public void setActivativationSatus(String activativationSatus) {
		this.activativationSatus = activativationSatus;
	}
}
