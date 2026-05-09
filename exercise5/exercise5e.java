import java.util.Scanner;

public class exercise5e {
    public static boolean isPrime(int n) {
        boolean prime = true;
        if (n < 2) {
            prime = false;
        }

        if (n != 2 && n % 2 == 0) {
            prime = false;
        }

        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n =input.nextInt();

        for (int i = 2; i<=n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }
}