import java.util.Scanner;

public class exercise2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        if (integer>0) {
            System.out.println("Positive");
        } else if (integer==0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }

        if (integer%2==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}