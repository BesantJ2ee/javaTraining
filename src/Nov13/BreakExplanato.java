package Nov13;

public class BreakExplanato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] a = {10, 3,4,5,6};//One way
   int[] a1 = new int[6];//2nd way way
   a1[0]=10;
   a1[1]=3;
   a1[2]=4;
   a1[3]=5;
   a1[4]=6;
   a1[5]=3;
   
 //  for(int i=0;i<a1.length;--i)
//   {
	//   if(a1[i]==4)
	//   {
	//	   System.out.println("inside if"+a1[i]);
	//	   continue;
		   
	 //  }
	//   System.out.println(a1[i]);
  // }
   
   int i=10;  
 //Entry controlled loop
   while(i>=2){  
       System.out.print(i);  
   i--;  
   }
   
   
   //Exit controlled loop
   int j=0;
   do {
		System.out.print(j);
		j++;
	}	while(j<10);
	
	
   
   
   
   
   
   int x=10;
   x+=5; //=>x=x+5
   x-=5;//=>x=x-5
  // System.out.println(x);
   
   
   
		
		
		
	}

}
