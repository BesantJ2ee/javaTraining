package Nov26;

public class ComandLineArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(Double.parseDouble(args[0])+
        		Double.parseDouble(args[1])+Double.parseDouble(args[2]));
	}

}
