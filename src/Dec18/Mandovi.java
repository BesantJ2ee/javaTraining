package Dec18;


//final class then that class cannot inherited
//parent child relationship cannot establish
 class Gujarat
{
	//final method cannot override
	 void goa()
	{
		System.out.println("Parent");
	}
	 //final method can overload
	 void goa(int a)
		{
			System.out.println("Parent");
		}
	
}
 class Gujarat1 extends Gujarat
{
	//final method cannot override
	 void goa()
	{
		System.out.println("Parent");
	}
	 //final method can overload
	 void goa(int a)
		{
			System.out.println("Parent");
		}
	
}
 class Gujarat2 extends Gujarat1
 {
 	//final method cannot override
 	 void goa()
 	{
 		System.out.println("Parent");
 	}
 	 //final method can overload
 	 void goa(int a)
 		{
 			System.out.println("Parent");
 		}
 	
 
public class Mandovi extends Gujarat{

	void goa()
	{
		super.goa(); 
		//this will call parent class goa 
//immediate parent class
		System.out.println("Child");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gujarat g1 = new Gujarat();
		Mandovi m1 = new Mandovi();
		//m1.goa();
		//g1.goa();
		
		//All are communicating
		
		//Dog will bark
		//cat will hisses
		//cow will moo
		//humans will speak/talk
		//Polymorphism
		//Run time polymorphism
		
	//	Parent  LHS  = RHS Child    
		Gujarat gm1 = new Mandovi();
		gm1.goa();
		
	//	Mandovi gm2 = new Gujarat(); not possible
		
		
		
		
		
	}

}
