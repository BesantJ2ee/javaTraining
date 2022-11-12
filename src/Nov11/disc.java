package Nov11;

public class disc {
	int c =20;//instance varibale
	static int b =20;//static  varibale
	//non return type
	//This method will not return anything
	//To run/execute this method object is required
	void main2(String[] aee)
	{
		
	}
	//Return type based on data type
	//if the method data type is string then return data
	//type only string
	//To run/execute this method object is required
	String main3(Integer[] args)
	{
	
		return "x";
	}
	//Return type based on data type
		//if the method data type is Integer then return data
		//type only Integer
	//To run/execute this method object is required
	Integer main4(Integer[] args)
	{
	
		return 12;
	}
	//Static return type method
	//and the return type is integer
	//To run/execute this method object is  not required
	//you can call the method directly
	
	Integer main5(String e)
	{
	    int a =10;//local variable
	    System.out.println(c+b);
		return 12;
	}
	
	static Integer main10(String e)
	{
	    System.out.println(b);
		return 12;
	}
	
	//static vois type method
	// this will not return anything
	//To run/execute this method object is  not required
	//you can call the method directly
	
	//Single line comment
	//swfef
	//fsfewe
	/*
	 * 
	 * wfwefkwef
	 * fwkfewfkew
	 * wsfkwjfew
	 */
	static void main6(Integer w)
	{
	String sdcds ="fsdfed";
	Integer w0=2;
	
	long w1 =23;
	long w2 =23L;
	long w3 =23l;
	
	double d1 = 123.4;
	double d2 = 1.234e10;
	double d3=0.0;
	double d4=3.14159;
	double d5=3.14159D;
	double d6 = 1.234e-10;
	System.out.println(d6+"\n"+d6);
	//char a ='\u2047';
	//System.out.println(a);
	
	float f1 = 123.4f;
	float f2 = 123.4F;

	  //Autoboxing
	int a=50;//primitive
	Integer a2=new Integer(a);//wrapper
     System.out.println(a2);
     
     //Unboxing
     Integer i=new Integer(50);
     int a5=i;
     
     System.out.println(a5);

		
	}
	
    /**
     * 
     * 
     * 
     * 
     * 
     * 
     * Documentation coomments
     * 
     * 
     * 
     * @param args
     */
	public static void main(String[] args) {
		
		
	//	Integer x=main5(null);
		
		main6(2);
		
		main6(2);
		
		
		main6(2);
		
		main6(2);
		main6(2);
		
		//Object creation
		disc q = new disc();
		disc q1 = new disc();
		disc q2 = new disc();
		disc q3 = new disc();
		disc q4 = new disc();
		q.main2(args);
		
		String x1 = q.main3(null);//the output method is string
		System.out.println(x1);
		q.main3(null);
		System.out.println(q.main3(null));
		Integer ti=q.main4(null);
		q.main4(null);
		
	}

}
