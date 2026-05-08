import java.util.Scanner;

public class exercise4e {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.println("Enter a month number: ");
        int month = input.nextInt();

        boolean leapYear= (year % 4 ==0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case 1:
                System.out.println(" 31 days");
                return;
            case 2:
                if (leapYear) {
                    System.out.println("29 days");
                } else {
                    System.out.println("28 days");
                }
                return;
            case 3:
                System.out.println("31 days");
                return;
            case 4:
                System.out.println("30 days");
                return;
            case 5:
                System.out.println("31 days");
                return;
            case 6:
                System.out.println("30 days");
                return;
            case 7:
                System.out.println("31 days");
                return;
            case 8:
                System.out.println("31 days");
                return;
            case 9:
                System.out.println("30 days");
                return;
            case 10:
                System.out.println("31 days");
                return;
            case 11:
                System.out.println("30 days");
                return;
            case 12:
                System.out.println("31 days");
                return;
            default:
                System.out.println("Uknown month");
                return;
        }
    }
}