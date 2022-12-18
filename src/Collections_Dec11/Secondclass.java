package Collections_Dec11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Secondclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//insertion order, duplicate removed
		LinkedHashSet<String> zlinked = new LinkedHashSet<String>();
		zlinked.add("apple");	
		zlinked.add("orange");
		zlinked.add("grape");
		zlinked.add("plum");
		zlinked.add("plum");
		for(String xc:zlinked)
		{
			System.out.println(xc);
			
		}
		
		//sorted based on ascending, duplicate removed
		TreeSet<String> ztree = new TreeSet<String>();
		ztree.add("apple");	
		ztree.add("orange");
		  ztree.add("grape");
		  ztree.add("plum");
		  ztree.add("plum");
		for(String xc:ztree)
		{
			//System.out.println(xc);
			
		}
		
		
		//no order based on hashcode, duplicate removed
		HashSet<String> az = new HashSet<String>();
		 az.add("apple");	
		  az.add("orange");
		  az.add("grape");
		  az.add("plum");
		  az.add("plum");
		for(String xc:az)
		{
			//System.out.println(xc);
			
		}
		
		//insertion order , duplicates allowed
		ArrayList<String>  a2 = new ArrayList<String>();
		  a2.add("apple");	
		  a2.add("orange");
		  a2.add("grape");
		  a2.add("plum");
		  a2.add("plum");
		  for(int i=0;i<a2.size();i++)
		  {
			  //printing the eleemts of the arrray object
			 // System.out.println(a2.get(i));
		  }
	}

}
