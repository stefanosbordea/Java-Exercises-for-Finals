import java.util.Scanner;

public class exercise1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for a temperature (Celsius): ");
        double celsius =Double.parseDouble(input.nextLine());

        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;

        System.out.printf("Celsius - %.2f | Fahrenheit - %.2f",celsius,fahrenheit);
    }
}