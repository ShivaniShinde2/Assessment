import java.util.Scanner;
public DigitSum15 
{
    public static void main(String args[])
    {
        int m, n, sumnum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = s.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sumnum = sumnum + n;
            m = m / 10;
        }
        System.out.println("Sum:"+sumnum);
    }
