import java.util.Scanner;
public class Table{
	public static void main(String[] args) {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the multiplication you want");
		number = sc.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", number, i, number * i);
        }
    }
}