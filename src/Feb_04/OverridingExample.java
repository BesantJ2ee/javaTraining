package Feb_04;

//Overriding
//hAPPEND DIFFERENT CLSS
//Run time polymorphism
//method name and argumets should be same
class p {
	void run() {
		System.out.println("run");
	}
}

class bp extends p {
	void run() {
		//super keyoword is used to called the method in parent class
		System.out.println("run2");
		super.run();
	}
}

public class OverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Polmorphism, Runtime polymorphism
		//talking/speakiign, each animals including different 
		//from parent only child can refer
		//from child paren t cannot refer
		//During run time polymorphism how can we call parent method
		p b1 = new bp();
		b1.run();

	}

}
