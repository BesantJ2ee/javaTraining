package Mar24_Encapsule;

import java.util.List;

public class Hospital {
	
	//User defined Object
	//Hospital,pen,student, box... etc
	//Generate getters and setter
	//Getter is reading 
	//setter is fr writting
	
	private String hospitalName;
	
	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalLocation() {
		return hospitalLocation;
	}

	public void setHospitalLocation(String hospitalLocation) {
		this.hospitalLocation = hospitalLocation;
	}

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

	private String hospitalLocation;
	
	private List<String> departments;
	

}
