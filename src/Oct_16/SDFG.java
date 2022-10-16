package Oct_16;

public class SDFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exact logic of replace all
		//replace first
		
		String v = "POLAND PORTUGUAL";
		// lOGIC for replace first
		String[] ab = v.split("");
		String x = null;
		String[] nm = new String[ab.length];
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
			}
		}
		for (int j = 0; j < nm.length; j++) {
			System.out.print(nm[j]);
		}

	}

}
