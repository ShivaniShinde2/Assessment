 import java.util.Scanner;
 class ScannerTest {
     public static void main(String[] args) {
		 Scanner sc=new Scanner (System.in);
		 System.out.println("Enter Your Roll.No.");
		 int rollno=sc.nextInt();
		 System.out.println("Enter Your Name:");
		 String name=sc.next();
		 System.out.println("Enter Your Fee;");
		 double fee=sc.nextDouble();
		 System.out.println("Roll.No.: "+rollno+"\tName: "+ name + "\tFee: "+fee);
		 sc.close();
    }
}