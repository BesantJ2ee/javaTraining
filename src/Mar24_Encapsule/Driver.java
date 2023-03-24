package Mar24_Encapsule;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> departmentForAppollo = 
				new ArrayList<String>();
		departmentForAppollo.add("Nephrology");
		departmentForAppollo.add("ENT");
		
		List<String> departmentForfORTIS = 
				new ArrayList<String>();
		departmentForAppollo.add("Nephrology");
		departmentForAppollo.add("Urology");
		
		List<String> departmentFormanipal = 
				new ArrayList<String>();
		departmentForAppollo.add("Cardialogy");
		departmentForAppollo.add("Urology");
		
		List<String> departmentForamrita = 
				new ArrayList<String>();
		departmentForAppollo.add("Neurology");
		departmentForAppollo.add("Urology");
		
		List<String> departmentFormedicom = 
				new ArrayList<String>();
		departmentForAppollo.add("Paediatricain");
		departmentForAppollo.add("Urology");
		
		Hospital vg = new Hospital();
		vg.setHospitalName("Appolo");
		vg.setHospitalLocation("Chennai");
		vg.setDepartments(departmentForAppollo);
		
		Hospital vg1 = new Hospital();
		vg1.setHospitalName("Fortis");
		vg1.setHospitalLocation("Bangalore");
		vg1.setDepartments(departmentForfORTIS);
		Hospital vg2 = new Hospital();
		vg2.setHospitalName("manipal");
		vg2.setHospitalLocation("mangalore");
		vg2.setDepartments(departmentFormanipal);
		
		Hospital vg3 =new Hospital();
		vg3.setHospitalName("Amrita me");
		vg3.setHospitalLocation("Faridabad");
		vg3.setDepartments(departmentForamrita);
		
		Hospital vg4 = new Hospital();
		vg4.setHospitalName("medicom");
		vg4.setHospitalLocation("nellore");
		vg4.setDepartments(departmentFormedicom);
		
		
	//	for(int i=0;i<departmentForamrita.size();i++) {
	//		System.out.println(departmentForamrita.get(i));
	//	}
		
	List<String> fg= new ArrayList<String>();	
	fg.add("sindhu");
	fg.add("sindhu");
	fg.add("sindhu");	
		for(String s1:fg)
		{
			System.out.println("List"+s1);
		}
		
		//Set will not allow duplicate
		List a1 = new LinkedList<>();
		a1.add("sindhu");
		a1.add("sindhuw");
		a1.add('5');
		a1.add(5);
				
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
	

	     //  A=> sindhu
		//	B=>5
		//	C=>sindhuw
		//	D=>none of the above
		//	E=>Compile time error
		
		
		
		Map<String, String> mapdffs= new HashMap<String, String>();
		mapdffs.put("svsvs", "ssfsd");
		mapdffs.put("svscscsvs", "cscds");
		mapdffs.put("svcs3cssvs", "csdcs");
		mapdffs.put("cs3cs", "csd");
		mapdffs.put("cscsd", "csd");
		
		
		for(Map.Entry<String, String> cv:mapdffs.entrySet())
		{
			if(cv.getKey().equals("svsvs"))
			{
				System.out.println("Key "+cv.getKey()+" "+"Value "+cv.getValue());	
			}
			
			
			
		}
		
		ArrayList<Integer> aq=new ArrayList<Integer>();
		aq.add(10);
		aq.add(5);
		aq.add(20);
		aq.add(20);
		aq.add(300);
		//10,5,20,20,300
		List<Integer> ac=new LinkedList<Integer>();
		ac.add(10);
		ac.add(5);
		ac.add(5);
		ac.add(20);
		ac.add(300);
		//10,5,5,20,300	
		//Set and LinkedHashSet will remove duplicate
		LinkedHashSet<Integer> ab=new LinkedHashSet<Integer>();
		ab.add(10);
		ab.add(10);
		ab.add(5);
		ab.add(20);
		ab.add(300);
		for(Integer z:ab)
		{
			System.out.println("LinkedHashSet"+z);
		}
		//TreeSet will remove duplicate
		
		                //common feature           //Uniquefeature
		//Set              duplicate removal        Order not maintaned
		//Treeset           duplicate removal       insertion order maintained
		//LinkedHashset       duplicate removal      sorted based on ascending
		
		
		TreeSet<Integer> aa=new TreeSet<Integer>();
		aa.add(10);
		aa.add(10);
		aa.add(5);
		aa.add(20);
		aa.add(300);
		for(Integer z:aa)
		{
			System.out.println("tREESET"+z);
		}
	
		
		
		
		
		
		
		
		
		
	}

}
