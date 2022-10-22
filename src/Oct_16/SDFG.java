package Oct_16;

public class SDFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exact logic of replace all
		//replace first
		
		String v = "POLANP";
		// lOGIC for replace first
		String[] ab = v.split("");
		int s =10;
		 s=20;
		
		String x = "v";
		       
		//default value of string is null
		String[] nm = new String[ab.length];
		//NM is having same elements of ab and the default elements are 
		//null
		//{"C",null,null,null,null,null}
		//Creating new string array
		//because existng array we cant modify
		//String[] nm = new String[ab.length];
		for (int i = 0; i < ab.length; i++) {
			if ("P".equals(ab[i])) {
				x = "C";
				//String x ="C";
				//= Equals is assighning
				nm[i] = x;
				//Adding to new array at 0 the position
			} else {
				//remaing all elements of array added to new array
				nm[i] = ab[i];
				//nm[1] =ab[1]
	//Telling that please assighn o element from ab array with position 1 to
	//o element to nm array with position 1
			}
		}
		for (int j = 0; j < nm.length; j++) {
			System.out.print(nm[j]);
		}

	}

}
