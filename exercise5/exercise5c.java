import java.util.Scanner;

public class exercise5c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int validCount=0;
        int validSum=0;

        do {

            System.out.println("Enter an integer: ");
            n = input.nextInt();

            if (n>=0) {
                validCount++;
                validSum+=n;
            } 
        } while (n >=0);
        System.out.printf("Positive numbers - %d%n",validCount);
        System.out.printf("Sum of input - %d%n",validSum);
    }
}