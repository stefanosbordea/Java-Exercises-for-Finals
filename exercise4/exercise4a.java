import java.util.Scanner;

public class exercise4a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();

        if (userInt>0 && userInt % 2 == 0) {
            System.out.println("positive and even");
        } else if (userInt > 0 && userInt % 2 != 0) {
            System.out.println("positive and odd");
        }else if (userInt < 0 && userInt % 2 == 0) {
            System.out.println("negative and even");
        }else if (userInt < 0 && userInt % 2 != 0) {
            System.out.println("negative and odd");
        }else{
            System.out.println("zero");
        }
    }
}