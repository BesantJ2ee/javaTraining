package Sep_25;

public class MethodsDiscussion {
	//Instance variable
	int a =10;
	int b=20;
    //Method name
	//Bracket is empty, there is no arguments
	void nellore()
	{
		//Variable used inside the method, and the scope is inside only
		//its called local variable
		int c=a+b;
		System.out.println(c);
	}
	//method name
	//Void means which will not return anything
	                  //Bracket is empty, there is no arguments
	void andhrapradesh()
	{
		int c=b-a;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Class Name      //Ref Variable /object creation
		//new is a keyword
		MethodsDiscussion xc=new MethodsDiscussion();
				                 //Constructor
				                 //Constructor is same as class name
				
		xc.andhrapradesh();
		xc.nellore();
		
	
		
	}

}
