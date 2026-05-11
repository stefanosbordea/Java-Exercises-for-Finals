import java.util.Scanner;

public class exercise7a {
    public static double celsiusToFahrenheit(double c) {
        double f = (c *1.8) +32;
        return f;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for Celsius: ");
        double c = input.nextDouble();

        System.out.printf("Fahrenheit - %.2f",celsiusToFahrenheit(c));
    }
}