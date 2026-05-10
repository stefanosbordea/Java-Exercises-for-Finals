import java.util.Scanner;

public class exercise6a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] userNums = new int[5];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer: ");
            int n = input.nextInt();

            userNums[i] = n;
            sum += n;

            if (n > max) {
                max = n;
            }

            if (n < min) {
                min = n;
            }
        }
        double avg = (double) sum / 5;
        for (int nums : userNums) {
            System.out.println(nums);
        }
        System.out.printf("Sum: %d%n",sum);
        System.out.printf("Avg: %.2f%n",avg);
        System.out.printf("Max: %d%n",max);
        System.out.printf("Min: %d%n",min);
    }
}