import java.util.Scanner;

public class exercise3b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String a = input.nextLine();

        System.out.print("Enter a second word :");
        String b = input.nextLine();

        if (a.equals(b)) {
            System.out.println("equal(case-sensitive)");
        }
        else if (a.toUpperCase().equals(b.toUpperCase())) {
            System.out.println("equal(case-insensitive)");
        }

        if (a.compareTo(b) == 0) {
            System.out.printf("Alphabetically first - %s",a);
        }
        else {
            System.out.printf("Alphabetically first - %s",b);
        }
    }
}