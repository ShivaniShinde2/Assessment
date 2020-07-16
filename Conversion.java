import java.util.Scanner;
public class Conversion{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String [] numbers={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        num = s.nextInt();
        if(numbers.length <= num || num>=0) {
        	System.out.print("Entered number:"+numbers[num-1]);
        }
	}

}