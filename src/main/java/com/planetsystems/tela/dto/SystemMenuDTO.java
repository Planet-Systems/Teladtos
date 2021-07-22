package com.planetsystems.tela.dto;

import com.planetsystems.tela.dto.enums.NavigationMenu;
import com.planetsystems.tela.dto.enums.SubMenuItem;

import java.util.ArrayList;
import java.util.List;

public class SystemMenuDTO extends ParentDTO {
	private static final long serialVersionUID = 1L;
	private String navigationMenu;
	private String subMenuItem;
	private String activationStatus;

	public SystemMenuDTO(String navigationMenu, String subMenuItem) {
		this.navigationMenu = navigationMenu;
		this.subMenuItem = subMenuItem;
	}

	public SystemMenuDTO() {
	}

	public SystemMenuDTO(String id) {
		super(id);
	}

	public static List<SystemMenuDTO> systemMenuDTOList(){
		//creating system menus
		List<SystemMenuDTO> configurationSideNavMenu = new ArrayList<>();
		configurationSideNavMenu.add(new SystemMenuDTO(NavigationMenu.SYSTEM_CONFIGURATION.getNavigationMenu() , SubMenuItem.DASHBOARD.getSystemMenuItem()));
		configurationSideNavMenu.add(new SystemMenuDTO(NavigationMenu.SYSTEM_CONFIGURATION.getNavigationMenu() , SubMenuItem.ASSESSMENT_PERIOD.getSystemMenuItem()));
		configurationSideNavMenu.add( new SystemMenuDTO(NavigationMenu.SYSTEM_CONFIGURATION.getNavigationMenu() , SubMenuItem.LOCATION.getSystemMenuItem()));
		configurationSideNavMenu.add(new SystemMenuDTO(NavigationMenu.SYSTEM_CONFIGURATION.getNavigationMenu() , SubMenuItem.SCHOOL_CLASS_CATEGORY.getSystemMenuItem()));
		configurationSideNavMenu.add(new SystemMenuDTO(NavigationMenu.SYSTEM_CONFIGURATION.getNavigationMenu() , SubMenuItem.SUBJECTS.getSystemMenuItem()));

		List<SystemMenuDTO> enrollmentSidNavMenu = new ArrayList<>();
		enrollmentSidNavMenu.add(new SystemMenuDTO(NavigationMenu.ENROLLMENT.getNavigationMenu() , SubMenuItem.LEARNER_ENROLLMENT.getSystemMenuItem()));
		enrollmentSidNavMenu.add(new SystemMenuDTO(NavigationMenu.ENROLLMENT.getNavigationMenu() , SubMenuItem.STAFF_ENROLLMENT.getSystemMenuItem()));

		List<SystemMenuDTO> attendanceSidNavMenu = new ArrayList<>();
		attendanceSidNavMenu.add(new SystemMenuDTO(NavigationMenu.ATTENDANCE.getNavigationMenu() , SubMenuItem.LEARNER_ATTENDANCE.getSystemMenuItem() ));
		attendanceSidNavMenu.add(new SystemMenuDTO(NavigationMenu.ATTENDANCE.getNavigationMenu() , SubMenuItem.STAFF_ATTENDANCE.getSystemMenuItem() ));
		attendanceSidNavMenu.add(new SystemMenuDTO(NavigationMenu.ATTENDANCE.getNavigationMenu() , SubMenuItem.STAFF_DAILY_ATTENDANCE_SUPERVISION.getSystemMenuItem()));
		attendanceSidNavMenu.add(new SystemMenuDTO(NavigationMenu.ATTENDANCE.getNavigationMenu() , SubMenuItem.STAFF_DAILY_TIMETABLE_LESSONS.getSystemMenuItem()));


		List<SystemMenuDTO> timetableSidNavMenu = new ArrayList<SystemMenuDTO>();
		timetableSidNavMenu.add(new SystemMenuDTO(NavigationMenu.TIMETABLE.getNavigationMenu() , SubMenuItem.TIMETABLE.getSystemMenuItem()));

		List<SystemMenuDTO> systemUserSidNavMenu = new ArrayList<SystemMenuDTO>();
		timetableSidNavMenu.add(new SystemMenuDTO(NavigationMenu.SYSTEM_USERS.getNavigationMenu() , SubMenuItem.SYSTEM_USERS.getSystemMenuItem()));

		List<SystemMenuDTO> reports = new ArrayList<>();
		reports.add(new SystemMenuDTO(NavigationMenu.GENERATE_REPORTS.getNavigationMenu(), SubMenuItem.SCHOOL_PERFORMANCE.getSystemMenuItem()));
		reports.add(new SystemMenuDTO(NavigationMenu.GENERATE_REPORTS.getNavigationMenu(), SubMenuItem.DISTRICT_PERFORMANCE.getSystemMenuItem()));
		reports.add(new SystemMenuDTO(NavigationMenu.GENERATE_REPORTS.getNavigationMenu(), SubMenuItem.NATIONAL_PERFORMANCE.getSystemMenuItem()));
		
		
//		List<SystemMenuDTO> incentives = new ArrayList<>();
//		incentives.add(new SystemMenuDTO(NavigationMenu.INCENTIVES.getNavigationMenu(), SubMenuItem.School_Performace.getSystemMenuItem()));
//		incentives.add(new SystemMenuDTO(NavigationMenu.INCENTIVES.getNavigationMenu(), SubMenuItem.District_Reports.getSystemMenuItem()));
//		incentives.add(new SystemMenuDTO(NavigationMenu.INCENTIVES.getNavigationMenu(), SubMenuItem.National_Reports.getSystemMenuItem()));
		
		
//		List<SystemMenuDTO> curriculumCoverage = new ArrayList<>();
//		curriculumCoverage.add(new SystemMenuDTO(NavigationMenu.CURRICULUM_COVERAGE.getNavigationMenu(), SubMenuItem.School_Performace.getSystemMenuItem()));
//		curriculumCoverage.add(new SystemMenuDTO(NavigationMenu.CURRICULUM_COVERAGE.getNavigationMenu(), SubMenuItem.District_Reports.getSystemMenuItem()));
//		curriculumCoverage.add(new SystemMenuDTO(NavigationMenu.CURRICULUM_COVERAGE.getNavigationMenu(), SubMenuItem.National_Reports.getSystemMenuItem()));
		
		List<SystemMenuDTO> utilityManager = new ArrayList<>();
		utilityManager.add(new SystemMenuDTO(NavigationMenu.UTILITY_MANAGER.getNavigationMenu(), SubMenuItem.DASHBOARD.getSystemMenuItem()));
		utilityManager.add(new SystemMenuDTO(NavigationMenu.UTILITY_MANAGER.getNavigationMenu(), SubMenuItem.DEVICE_MANAGER.getSystemMenuItem()));
		utilityManager.add(new SystemMenuDTO(NavigationMenu.UTILITY_MANAGER.getNavigationMenu(), SubMenuItem.SMS_MANAGER.getSystemMenuItem()));


		List<SystemMenuDTO> systemMenuDTOList = new ArrayList<>();
		systemMenuDTOList.addAll(configurationSideNavMenu);
		systemMenuDTOList.addAll(attendanceSidNavMenu);
		systemMenuDTOList.addAll(enrollmentSidNavMenu);
		systemMenuDTOList.addAll(timetableSidNavMenu);
		systemMenuDTOList.addAll(systemUserSidNavMenu);
		systemMenuDTOList.addAll(reports);
		systemMenuDTOList.addAll(utilityManager);

		//systemMenuDTOList.addAll(incentives);
		//systemMenuDTOList.addAll(curriculumCoverage);
		

		
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

	public String getActivationStatus() {
		return activationStatus;
	}

	public void setActivationStatus(String activationStatus) {
		this.activationStatus = activationStatus;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("SystemMenuDTO{");
		sb.append("navigationMenu='").append(navigationMenu).append('\'');
		sb.append(", subMenuItem='").append(subMenuItem).append('\'');
		sb.append(", activationStatus='").append(activationStatus).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
