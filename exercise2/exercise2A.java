import java.util.Scanner;

public class exercise2A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = input.nextInt();

        System.out.print("Enter another integer: ");
        int b = input.nextInt();
        if (b==0) {
            System.out.println("Cannot divide by 0");
            return;
        }
        
        input.nextLine();

        int sum = a+b;
        int difference = a-b;
        int product = a*b;
        int integerQuotient = a/b;
        int remainder = a%b;

        System.out.printf("Sum = %d%n",sum);
        System.out.printf("Difference  %d%n",difference);
        System.out.printf("Product %d%n",product);
        System.out.printf("Integer quotient = %d%n",integerQuotient);
        System.out.printf("Remainder = %d%n",remainder);
    }   
}
