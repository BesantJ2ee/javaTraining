package Feb_04;

//Multiple inheritance is not supported in java
//but it support through interface
public interface Sample {
	
	//methods whether its return or non return type
	//in interface is called abstract method
	//but this not applicable to static and default method
	
	//If there is no abstract keyword java compiler will 
	//automatically add
	//abstract keyword
	//this is not applicable to static and default methods
	
	
	//If you have an abstract method in the interface
	//it should implements
	//this is not aplicable to static and default methods
	
	abstract void x();
	abstract void xyz(int a, int b);
	 abstract String f();
	 String xcv(int a , int b);
	 
	 static void abc()
	 {
		 
		 
	 }
	 
	 static int abcf()
	 {
		 
		return 0; 
	 }
	 
	 default void xyz()
	 {
		 
	 }

}
