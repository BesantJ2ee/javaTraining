package Feb05;

//When a class is make as final it cannot be inherited
//When a method make as final it cannot override
class A
{
    void speed()
    {
    	
    }
	
}
 class B extends A
{
	final void speed()
	{
		
	}
}
class C extends B
{
	void speed()
	{
		
	}
}


public class Discussion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
