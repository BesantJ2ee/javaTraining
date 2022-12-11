package Collections_Dec11;

import java.util.ArrayList;
import java.util.LinkedList;

//Colections
//TO store group of similar elements
//Different types of collections
//ArrayList
//Linkedlist..etc
public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//angle bracket with collection is called generics
      ArrayList<String>  a1 = new ArrayList<String>();
	  a1.add("Tree");	
	  a1.add("Plants");
	  a1.add("Flower");
	  a1.add("fruists");
	  //int and Integer
	  int a=9;
	  //Primitive
	  Integer ayu=12;
	  //Wrapper
	  //int q=null;
	  //Integer asf=null;
	    
	  //double and Double
	  ArrayList<Integer>  a2 = new ArrayList<Integer>();
	  a2.add(8);	
	  a2.add(9);
	  a2.add(5);
	  a2.add(6);
	  //12 elements only u can add
	  //elements can add ftill the default value reach
	  //after if we add the  element ten automatically
	  //arraylist will grow
	  ArrayList<Double>  a4 = new ArrayList<Double>();
	  a4.add(8.52);	
	  a4.add(9.47);
	  a4.add(5.41);
	  a4.add(6.78);
	  a4.remove(3);	 
	  a4.clear();
	  a4.add(0, 5.99);
	  a4.add(1, 7.89);
	  a4.add(2, 4.77);
	  a4.add(3, 4.77);
	//insertion order , duplicates allowed
	  LinkedList<String> a7 = new LinkedList<String>();
	  a7.add("Ssvsdfs");
	  a7.add("vdscsd");
	  a7.add("sfcsd");
	  a7.add("sfcsd");
	  
	  for(int i=0;i<a7.size();i++)
	  {
		  //printing the eleemts of the arrray object
		  System.out.println(a7.get(i));
	  }
	  
		
	  ArrayList<Integer>  ag = new ArrayList<Integer>();
	  
	 // System.out.println(a4);//printing the array object
	  
	//  System.out.println("New for loop");
	  for(Double sleep:a4)
	  {
		 
		//  System.out.println(sleep);
		  
	  }
	  
	  
	  
	  
	  
	  
	}

}
