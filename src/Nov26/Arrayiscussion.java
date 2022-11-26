package Nov26;

public class Arrayiscussion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
         //String[] abc{null,null,null,null}
         int[] acv = new int[3];
         //int[] acv ={0,0,0};
         Integer[] avb = new Integer[2];
         //Integer[] avb ={null,null};
         
         String[] a1 = {"1","2","3"};
         
         
         int[] acv1 = new int[4];
         acv1[0]=79;
         acv1[1]=78;
         acv1[2]=71;
         acv1[3]=72;
         
         double[] acv2 = new double[3];
         acv2[0]=1.00;
         acv2[1]=1.20;
         acv2[2]=1.40;
         
         String[] abc = new String[2];
         abc[0]="afdsfsd";
         abc[1]="sscf";
         
         
         for(int i=0;i<abc.length;i++)
         {
        	 
        	 System.out.println(abc[i]);
         }
         
String[][] abcmulti = new String[2][2];
abcmulti[0][0]="orange"; 
abcmulti[0][1]="yuu";
abcmulti[1][0]="apple";
abcmulti[1][1]="kbbb";
         
         
         
String[][] abcmulti2ndway = 
{{"orange","grape"},{"apple","pears"}};
         
         
for(int i=0;i<abcmulti2ndway.length;i++)
{
   for(int j=0;j<abcmulti2ndway.length;j++)
   {
	   System.out.print(abcmulti2ndway[i][j]+" ");
   }
   System.out.println(" ");
	
}




         
	}

}
