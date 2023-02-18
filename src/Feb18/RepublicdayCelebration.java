package Feb18;

public class RepublicdayCelebration {

	//If a classs doesnot have any constructor it means that java internall
	//creates a empty constructor
	
	
	//this is call empty argument constructor
	//
	//Constructor does not have a return value/tuype
	
	//Is constructor is a method?? no constructor is not a method 
	//it does not return any value an name should be same as class name
	//We can write how many constructors we want
	
	RepublicdayCelebration()
	{
	  //Constructor is callig another constructor internally
		//this keyword will check for the current class
	  this(10);
	}
	//Constructor will not override
//	RepublicdayCelebration()
//	{
	
//	}
	//Constructor will overload
	RepublicdayCelebration(int a)
	{
	    this(20,"abc");
		System.out.println(a);
	}
	
	RepublicdayCelebration(int a, String b)
	{
	System.out.println(a);
	}
	
	//Constructor chaining
	int zcvv()
	{
		return 10;
	}
	
	
	void xyz()
	{
		System.out.println("January 26");
	}
}
