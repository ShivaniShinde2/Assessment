import java.util.Scanner;
public class Factorial {
	public static void main(String args[]){
		  int i,fact=1;
		   System.out.println("Enter the number:");
		         Scanner sc = new Scanner(System.in);
		         int number = sc.nextInt();
				 sc.close();
		  for(i=1;i<=number;i++){
		      fact=fact*i;
		  }
		  System.out.println("Factorial:\t"+fact);
		  }
	

}