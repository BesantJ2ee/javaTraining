package Oct_16;

public class Discucssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      String a ="JavaS";
      String b ="javas";
      String c=" ";
  //    System.out.println(a+b);
  //    System.out.println(a+c+b);
      //Methods available in inbuild methods in string class
 
     // System.out.println(a.charAt(7));
      
  //    System.out.println(a.length());
  //    System.out.println(b.length());
        
      if(a.equalsIgnoreCase(b))//Condition should be boolean, it should be either true or false
      {  	  
    	  //do the operation
    	  System.out.println("Leo");
      }else {
    	  //do the operation based on that
    	  System.out.println("Leo tolstoy");
      }
      
   //   System.out.println("Welcome".startsWith("W"));
    //  System.out.println("Welcome".endsWith("k"));  
      
    // System.out.println("Porugual ugy".replace('u','k' )+" replace method");
      
   //   System.out.println("Porugual ugy".replaceAll("ugu", "k")+" replace all method");
	
   //   System.out.println("IpruguaL Poland".replaceFirst("P", "C"));
  //    System.out.println();   
      String v="POLAND";
      //lOGIC for replace first     
      String[] ab=v.split("");
      String x=null;
      String y=null;
      String[] nm= {};
      for(int i=0;i<ab.length;i++)
      {
    	  System.out.println(ab[i]);
      }	
	}

}
