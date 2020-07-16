import java.util.Scanner;
public class DaysMonth {
	public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int nodm= 0; 
        String name= "Unknown";

        System.out.print("Month Number= ");
        int month = input.nextInt();

        System.out.print(" Year= ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                name= "January";
                nodm= 31;
                break;
            case 2:
                name= "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    nodm= 29;
                } else {
                    nodm= 28;
                }
                break;
            case 3:
                name= "March";
                nodm= 31;
                break;
            case 4:
                name= "April";
                nodm= 30;
                break;
            case 5:
                name= "May";
                nodm= 31;
                break;
            case 6:
                name= "June";
                nodm= 30;
                break;
            case 7:
                name= "July";
                nodm= 31;
                break;
            case 8:
                name= "August";
                nodm= 31;
                break;
            case 9:
                name= "September";
                nodm= 30;
                break;
            case 10:
                name= "October";
                nodm= 31;
                break;
            case 11:
                name= "November";
                nodm= 30;
                break;
            case 12:
                name= "December";
                nodm= 31;
        }
        System.out.print(name+ " " + year + " has " + nodm+ " days\n");

}
}