import java.util.Scanner;

public class exercise1E {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        double a = input.nextDouble();

        System.out.print("Enter another integer: ");
        double b = input.nextDouble();

        int integerDiv = (int)a/ (int)b ;
        double normalDiv = a/b;

        System.out.printf("Normal Division - %.2f%n",normalDiv);
        System.out.printf("Integer Division - %d%n",integerDiv);
    }
}