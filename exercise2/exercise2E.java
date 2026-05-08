import java.util.Scanner;

public class exercise2E {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        boolean isLeap = (year % 4 ==0 && year %100 !=0) || (year % 400 == 0);

        System.out.printf("%s - %s",year,isLeap);
    }
}