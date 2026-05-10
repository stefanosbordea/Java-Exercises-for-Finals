import java.util.Scanner;

public class exercise6b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] integers = new int[6];

        for (int i = 0; i<6; i++) {
            System.out.print("Enter an integer: ");
            int n = input.nextInt();

            integers[i] = n;
        }

        System.out.println();
        System.out.print("Array: ");
        for (int integer : integers) {
            System.out.print(integer + " ");
        }

        System.out.println();
        System.out.print("Reverse: ");
        for (int i = integers.length-1;i >= 0; i-- ) {
            System.out.print(integers[i]+" ");
        }
    }
}