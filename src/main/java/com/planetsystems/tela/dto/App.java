package com.planetsystems.tela.dto;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Date;

/**
 * Hello world!
 *
 */
@EnableSwagger2
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        final String STATUS = "ACTIVE";

        //testing dtos
        System.out.println(new ParentDTO());

        RegionDto region = new RegionDto();
        region.setId("12wdx");
        region.setName("Central");
        region.setCode("CTL");
        region.setStatus(STATUS);
        region.setDateCreated("09-08-1996");
        System.out.println(region);
        System.out.println("\n");


        DistrictDTO districtDTO = new DistrictDTO();
        districtDTO.setRolledOut(true);
        districtDTO.setCode("KLA");
        districtDTO.setName("Kampala");
        districtDTO.setStatus(STATUS);
        districtDTO.setId("325432edfcrfeds");
        districtDTO.setDateCreated("08-09-2021");
        districtDTO.setRegion(region);
        System.out.println(districtDTO);
        System.out.println("\n");


        AcademicYearDTO academicYearDTO = new AcademicYearDTO();
        academicYearDTO.setActivationStatus(STATUS);
        academicYearDTO.setCode("CODE");
        academicYearDTO.setName("2021");
        academicYearDTO.setStatus(STATUS);
        academicYearDTO.setId("234TREFDWS");
        academicYearDTO.setStartDate("01-01-2021");
        academicYearDTO.setEndDate("01-01-2022");
        academicYearDTO.setDateCreated("05-02-2020");
        academicYearDTO.setDateUpdated("05-02-2020");
        System.out.println(academicYearDTO);
        System.out.println();


        AcademicTermDTO academicTermDTO = new AcademicTermDTO();
        academicTermDTO.setAcademicYear(academicYearDTO);
        academicTermDTO.setActivationStatus(STATUS);
        academicTermDTO.setTerm("III");
        academicTermDTO.setCode("III");
        academicTermDTO.setId("1234dsdfvrew543ed");
        academicTermDTO.setEndDate("09-08-2020");
        academicTermDTO.setStartDate("09-08-2020");
        academicTermDTO.setDateCreated("09-08-2020");
        academicTermDTO.setDateUpdated("09-08-2020");
        System.out.println(academicTermDTO);
        System.out.println();

        SchoolCategoryDTO schoolCategoryDTO = new SchoolCategoryDTO();
        schoolCategoryDTO.setId("5432wdc");
        schoolCategoryDTO.setCode("ART");
        schoolCategoryDTO.setName("ARTS & CULTURE");
        schoolCategoryDTO.setDateCreated("09-08-2020");
        schoolCategoryDTO.setStatus(STATUS);
        schoolCategoryDTO.setDateUpdated("09-08-2020");
        System.out.println(schoolCategoryDTO);
        System.out.println();

        SchoolDTO schoolDTO = new SchoolDTO();
        schoolDTO.setId("64532wdf65tredf");
        schoolDTO.setDeviceNumber("1324543543");
        schoolDTO.setName("Kabowa Primary School");
        schoolDTO.setCode("tyws");
        schoolDTO.setActivationStatus(STATUS);
        schoolDTO.setAttendanceTracked(true);
        schoolDTO.setDistrict(districtDTO);
        schoolDTO.setLatitude("0.000000000");
        schoolDTO.setLocation("estern");
        schoolDTO.setLatitude("0.00000000");
        schoolDTO.setSchoolCategory(schoolCategoryDTO);
        schoolDTO.setStatus(STATUS);
        schoolDTO.setDateUpdated("09-08-2020");
        schoolDTO.setDateCreated("09-08-2020");
        System.out.println(schoolDTO);
        System.out.println();

        SchoolClassDTO schoolClassDTO = new SchoolClassDTO();
        System.out.println(schoolClassDTO);
        System.out.println();

        System.out.println(new SubjectCategoryDTO());
        System.out.println();

        System.out.println(new SubjectDTO());
        System.out.println();

        System.out.println(new SystemUserDTO());
        System.out.println();

        System.out.println(new GeneralUserDetailDTO());
        System.out.println();

        System.out.println(new SystemUserGroupDTO());
        System.out.println();

        System.out.println(new SystemUserGroupPermissionDTO());
        System.out.println();

        System.out.println(new SystemUserProfileDTO());
        System.out.println();
    }
}
