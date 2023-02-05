package Feb05;

import java.util.Arrays;

public class Student {
	
	@Override
	public String toString() {
		return "Student [collegename=" + collegename + ", courses="
				+ Arrays.toString(courses) + ", collegeLocation=" + collegeLocation + ", fees=" + fees
				+ ", departments=" + Arrays.toString(departments) + ", phoneNumber=" + phoneNumber 
				+ ", hostelRoomNumber=" + hostelRoomNumber + ", hostelRommatesName="
				+ Arrays.toString(hostelRommatesName) + ", student_Name=" + studentName + "]";
	}

	private Integer rollNumber;
	
	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getCollegeLocation() {
		return collegeLocation;
	}

	public void setCollegeLocation(String collegeLocation) {
		this.collegeLocation = collegeLocation;
	}

	public Integer getFees() {
		return fees;
	}

	public void setFees(Integer fees) {
		this.fees = fees;
	}

	public String[] getDepartments() {
		return departments;
	}

	public void setDepartments(String[] departments) {
		this.departments = departments;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCollegEmailId() {
		return collegEmailId;
	}

	public void setCollegEmailId(String collegEmailId) {
		this.collegEmailId = collegEmailId;
	}

	public Integer getHostelRoomNumber() {
		return hostelRoomNumber;
	}

	public void setHostelRoomNumber(Integer hostelRoomNumber) {
		this.hostelRoomNumber = hostelRoomNumber;
	}

	public String[] getHostelRommatesName() {
		return hostelRommatesName;
	}

	public void setHostelRommatesName(String[] hostelRommatesName) {
		this.hostelRommatesName = hostelRommatesName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	private String collegename;
	
	private String[] courses;
	
	private String collegeLocation;
	
	private Integer fees;
	
	private String[] departments;
	
	private Integer phoneNumber;
	
	private String collegEmailId;
	
	private Integer hostelRoomNumber;
	
	private String[] hostelRommatesName;
	
	private String studentName;
	
	
	
	
	
	
	
	

}
