import java.util.Scanner;
public class exercise4b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = input.nextInt();

        if (score > 89) {
            System.out.println("A - Excellent");
        } else if (score > 79) {
            System.out.println("B - Good");
        } else if (score > 69) {
            System.out.println("C - Pass");
        } else if (score > 59) {
            System.out.println("D - Borderline");
        } else {
            System.out.println("F - Fail");
        }
    }
}