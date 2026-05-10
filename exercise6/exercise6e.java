import java.util.Scanner;

public class exercise6e {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[] values = new double[5];

        double sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an exam score: ");
            double n = input.nextDouble();

            values[i] = n;

            sum+=n;
        }
        double avg = sum/5;

        for (int i = 0; i < 5; i++) {
            if (values[i] > avg) {
                System.out.printf("%.2f - above average%n",values[i]);
            } else if (values[i]<avg) {
                System.out.printf("%.2f - below average%n",values[i]);
            } else {
                System.out.printf("%.2f - average%n",values[i]);
            }
        }


    }
}