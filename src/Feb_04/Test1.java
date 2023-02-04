package Feb_04;

abstract class ert
{
	abstract void x();
	static void xyz()
	{
		
	}
	abstract String y();
	
	
}

//Abstract class will inherit
abstract class ert2 extends ert
{
	
}

public class Test1 extends ert2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//if the class is abstract then you cannot create object
		
	//	ert sd = new ert();
		
	}

	@Override
	void x() {
		// TODO Auto-generated method stub
		
	}

	@Override
	String y() {
		// TODO Auto-generated method stub
		return null;
	}

}
