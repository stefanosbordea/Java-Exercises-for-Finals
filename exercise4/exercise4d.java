import java.util.Scanner;

public class exercise4d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month number(1-12): ");
        int monthNum = input.nextInt();

        switch (monthNum) {
            case 1:
                System.out.println("January - 31 days");
                return;
            case 2:
                System.out.println("February - 28 days");
                return;
            case 3:
                System.out.println("March - 31 days");
                return;
            case 4:
                System.out.println("April - 30 days");
                return;
            case 5:
                System.out.println("May - 31 days");
                return;
            case 6:
                System.out.println("June - 30 days");
                return;
            case 7:
                System.out.println("July - 31 days");
                return;
            case 8:
                System.out.println("August - 31 days");
                return;
            case 9:
                System.out.println("September - 30 days");
                return;
            case 10:
                System.out.println("October - 31 days");
                return;
            case 11:
                System.out.println("November - 30 days");
                return;
            case 12:
                System.out.println("December - 31 days");
                return;
            default:
                System.out.println("Uknown day");
                return;
        }
    }
}