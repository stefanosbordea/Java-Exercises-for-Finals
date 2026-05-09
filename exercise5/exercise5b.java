import java.util.Scanner;

public class exercise5b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        for (int i = 1; i<=12; i++) {
            System.out.printf("%d x %d = %d%n",n,i,n*i);
        }
    }
}