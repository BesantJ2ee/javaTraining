package Feb05;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student sq = new Student();
		sq.setStudentName("Sindhu");
		sq.setCollegeLocation("Gulbarga");
		sq.setFees(352352);
		String[] courses = {"English","Physics","Botany","Chemistry"} ;
		sq.setCourses(courses);
		
		
		Student p1 = new Student();
		p1.setStudentName("Sindhu");
		p1.setCollegeLocation("Gulbarga");
		p1.setFees(352352);
		String[] course = {"Botany","Chemistry"} ;
		p1.setCourses(course);
		
		Student p6 = new Student();
		p6.setStudentName("Sindhu");
		p6.setCollegeLocation("Gulbarga");
		p6.setFees(352352);
		String[] courset = {"Botany","Chemistry","Zoology"} ;
		p6.setCourses(courset);
		
		
		
		
		
		System.out.println(p6);
		System.out.println(p1);
		System.out.println(sq);
	}

}
