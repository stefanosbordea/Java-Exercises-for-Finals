import java.util.Scanner;

public class exercise6c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] integers = new int[7];

        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        
        for (int i = 0; i <7; i++) {
            System.out.print("Enter an integer: ");
            int n = input.nextInt();

            integers[i] = n;
        }

        for (int integer : integers) {
            if (integer > 0) {
                posCount ++;
            } else if (integer < 0) {
                negCount++;
            } else {
                zeroCount ++;
            }
        }

        System.out.printf("Positive - %d%n",posCount);
        System.out.printf("Negative - %d%n",negCount);
        System.out.printf("Zeros - %d%n",zeroCount);
    }
}