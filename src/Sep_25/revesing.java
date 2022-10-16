package Sep_25;

public class revesing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      String af ="France";
      //Array means group of similar items
      String[] df=af.split("");
      //Group of string elements is calles string array
      //String[] df1 = {"f","r","a","n","c","e"};
      //df = {"f","r","a","n","c","e"};
		//In array there is a concept called index
      //no of elements 6
      //index will start from 0
       //when u have group of elements u need to process
      //using for loop 
      //Condition and initialin
  // declaring a varaible;condition check;increment or decrement   
      System.out.println(df.length);
      //0<6   true   //6
      //1<6   true
      //2<6    true
      //3<6    true
      //4<6    true
      //5<6    true
      //6<6   false
      
      //i=0 0<=3 true df[0]=f
      //i=1 1<=3 true df[1]=r
      //i=2 2<=3 true df[2]=a
      //i=3 3<=3 true df[3]=n
      //0, 1,2,3,4 =>incrment by 1
      //4,3,2,1,0=>decrement by 1
      //Lower number;higher/i++
      //increment
      for(int i=0;i<df.length;i++)
      {
    	//  System.out.println(df[i]);
      }
    //higher number;lower/i--
      //2>=0 true  df[2]=A
      //1>=0 TRUE  df[1]=S
      //0>=0 true  df[0]=U
      //-1>=0 False
      //Decrement
      for(int i=df.length-1;i>=0;i--)
      {
    	 if("F".equals(df[i]))
    	 {
    		 System.out.println(i);	 
    		 System.out.println(df[i+8]);
    	 }
  	 
      }
      
      
      
      
      
	
	
	}

}
