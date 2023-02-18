package Feb18;


//A constructor name should be same as class name

//Construction-> Building

class A
{
	     //Method
	void bcd()
	{
		
	}
}



public class MainRef {
	
	void shivrathri1()
	{
		System.out.println("Fastning");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shiva z1 = new Shiva(); //How to create an object from a class
		z1.shivrathri();
		MainRef cv  = new MainRef();
		cv.shivrathri1();
		
		RepublicdayCelebration reb= new RepublicdayCelebration();
		reb.xyz();
		           //Open and close bracket along 
		           //with a class name is called constructor     
		A zq = new A();
		
		
		RepublicdayCelebration xcc = new RepublicdayCelebration();
		xcc.xyz();
		
		RepublicdayCelebration xcc1 = new RepublicdayCelebration();
		xcc.xyz();
		
		
		RepublicdayCelebration xcc2 = new RepublicdayCelebration(10);
		xcc2.xyz();
		
		RepublicdayCelebration xcc3 = new RepublicdayCelebration(10,"abc");
		xcc3.xyz();

	}

}
