import java.util.Scanner;

public class exercise1C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.printf("%s is %d years old.",name,age);

    }
}