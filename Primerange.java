public class Primerange {
	public static void main (String[] args)
	   {		
	       int i =0;
	       int number =0;
	       String  pN = "";

	       for (i = 1; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(number =i; number>=1; number--)
		  {
	             if(i%number==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     pN = pN + i + " ";
		  }	
	       }	
	       System.out.println("Range of prime numberbers from 1 to 100 are :");
	       System.out.println(pN);
	   }

}