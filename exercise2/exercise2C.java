import java.util.Scanner;
import java.util.Arrays;

public class exercise2C {
    public static int countDigits(int n) {
        int count = 0;
        while (n>10) {
            n /= 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three digit integer");
        int n = input.nextInt();

        String[] units = {"Ones","Tens","Hundreds"};
        int digits = countDigits(n);
    
        System.out.println();
        System.out.println("------------");
        for (int i = 0; i <= digits; i++ ) {
            int digit = n % 10;
            n /= 10;

            int breakDown = digit * (int) Math.pow(10, i);

            System.out.printf("%s - %d%n",units[i],breakDown);
        }
    }
}