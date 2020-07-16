import java.util.Scanner;
 public class Prime{
	 public static void main(String args[])
	 {
		 int temp;
		 boolean pN=true;
		 Scanner sc= new Scanner (System.in);
		 System.out.println("Enter the no.:");
		 int num=sc.nextInt();
		     sc.close();
		  for (int i=2; i<=num/2; i++)
		  {  
			  temp=num%i;
			    if(temp==0)
		        {
			    	pN=false;
			        break;
			    	
		        }
		  }
		  if(pN)
			  System.out.println(num+" prime Number");
			  else
				  System.out.println(num+" Not prime NUmber");
	 }
	 
		
		 
		 
	 }
 