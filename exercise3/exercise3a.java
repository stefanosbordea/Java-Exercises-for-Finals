import java.util.Scanner;

public class exercise3a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.charAt(fullName.length()-1));
    }
}
