package Nov27;

public class String_Buff_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a ="Sindhu";//literal
		String a1 = new String("Sindhu ");//creating an onbject
		String B ="Sindhu";
		//final means u cannot change
		//immutable 
		System.out.println(a.hashCode());
		System.out.println(B.hashCode());
		
		
		String place1 ="chennai";
		place1=place1+"a";
	//	System.out.println(place1);
		
		final String place ="chennai";
	//	place=place+"a";
	//	System.out.println(place);
		
		String a5 ="a";
		a5=a5.concat("b");
	
		System.out.println(a5);
		
		
		StringBuffer ac= new StringBuffer();		
		ac.append("a");
		ac.append("b");
		ac.append("c");
		ac.reverse();
	
		System.out.println(ac.toString());
		
		StringBuilder acx = new StringBuilder();
		acx.append("a");
		acx.append("b");
		acx.reverse();
		
		System.out.println(acx.toString());
		
	}

}
