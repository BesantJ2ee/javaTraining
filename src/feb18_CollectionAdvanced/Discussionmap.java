package feb18_CollectionAdvanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Discussionmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//AT A TIME ONE GENERIC TYPE ONLY WE CAN PASS
		List<String> a1 = new LinkedList<String>();
		a1.add("vsvsd");

		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("dsf");
		
		//AT A TIME ONE GENERIC TYPE ONLY WE CAN PASS 2
		Map<String, String>  a3 = new HashMap<String, String>();
		a3.put("aaa", "aan");
		a3.put("aaa", "aan");
		a3.put("aaa", "aan");
		
		
		
		Map<String, Integer>  a4 = new HashMap<String, Integer>();
		a4.put("aaa", 1);
		a4.put("aaa",3);
		a4.put("aaa",2);
		
		
		
		
		
		
		
		
		

	}

}
