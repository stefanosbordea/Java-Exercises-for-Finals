import java.util.Scanner;

public class exercise5a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        int sum = 0;
        double avg = 0;
        for (int i = 1; i <= n; i++) {
            sum +=i;
            System.out.println(i);
            
        }
        avg += (double) sum/n;

        System.out.println();
        System.out.printf("Sum = %d%n",sum);
        System.out.printf("Average = %.2f%n",avg);
    }
}