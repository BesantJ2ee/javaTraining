package Oct_16;

import Oct17.Nellore;

public class Oct29 {
	
	private void xyz()//non static method
	{
		System.out.println("Celeb");
	}
	
	static void abcoct29()// Static method
	{
		System.out.println("Same methods");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create a object
		Oct29 abc= new Oct29();
		abc.xyz();
		
		Occt29_2 abc2= new Occt29_2();
		abc2.xyzq1();
		abc2.cngsnfn();
		
		
		Nellore abv = new Nellore();//Non static methods
		abv.apsrtc();//Using object creation, 
		//and reference variable
		
		
//Static method call with class name		
		Nellore.apsrtc2();// Due to outside of the package
		
		//Two ways due to same class
		abcoct29();
		
		Oct29.abcoct29();
	}

}
