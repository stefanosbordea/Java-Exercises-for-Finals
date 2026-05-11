import java.util.Scanner;

public class exercise7c {
    public static int max(int a, int b, int c) {
        int max = a;
        int[] values = {a,b,c};

        for (int i = 1; i<3; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = input.nextInt();

        System.out.print("Enter an integer: ");
        int b = input.nextInt();

        System.out.print("Enter an integer: ");
        int c = input.nextInt();

        System.out.printf("Max - %d%n",max(a, b, c));
    }
}