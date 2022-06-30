package com.planetsystems.tela.dto;

public class SchoolClassDTO extends ParentDTO {
     
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String code;
    private String name;
    private SchoolDTO schoolDTO;
    private AcademicTermDTO  academicTermDTO;
    
    private boolean hasStreams;
	private boolean classLevel; 
	private SchoolClassDTO parentSchoolClass;
 

    public SchoolClassDTO() {
    }

    public SchoolClassDTO(String id) {
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

    public SchoolDTO getSchoolDTO() {
        return schoolDTO;
    }

    public void setSchoolDTO(SchoolDTO schoolDTO) {
        this.schoolDTO = schoolDTO;
    }

    public AcademicTermDTO getAcademicTermDTO() {
        return academicTermDTO;
    }

    public void setAcademicTermDTO(AcademicTermDTO academicTermDTO) {
        this.academicTermDTO = academicTermDTO;
    }


    public boolean isHasStreams() {
		return hasStreams;
	}

	public void setHasStreams(boolean hasStreams) {
		this.hasStreams = hasStreams;
	}

	public boolean isClassLevel() {
		return classLevel;
	}

	public void setClassLevel(boolean classLevel) {
		this.classLevel = classLevel;
	}

	public SchoolClassDTO getParentSchoolClass() {
		return parentSchoolClass;
	}

	public void setParentSchoolClass(SchoolClassDTO parentSchoolClass) {
		this.parentSchoolClass = parentSchoolClass;
	}

	@Override
    public String toString() {
        return "SchoolClassDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", schoolDTO=" + schoolDTO +
                ", academicTermDTO=" + academicTermDTO +
                '}';
    }
}
