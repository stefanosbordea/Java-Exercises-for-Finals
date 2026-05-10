import java.util.Scanner;

public class exercise6d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] values = new int[8];
        
        for (int i = 0; i<8; i++) {
            values[i] = i;
            
        }

        System.out.print("Enter a target value: ");
        int target = input.nextInt();

        for (int i = 0; i < 8; i++) {
            if (values[i] == target){
                System.out.printf("Index - %d%n",i);
                return;
            }
        }
        System.out.println("Not found");
    }
}