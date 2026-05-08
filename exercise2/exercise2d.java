import java.util.Scanner;

public class exercise2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = input.nextInt();

        System.out.print("Enter another integer: ");
        int b = input.nextInt();

        System.out.println();
        System.out.printf("Initial a - %d%n",a);
        System.out.printf("Initial b - %d%n",b);
        System.out.println("--------------");
    
        System.out.printf("a++ - %d a - %d%n",a++,a); ///a is incremented after printing
    
        System.out.printf("++a - %d a - %d%n",++a,a); /// a is incremented before printing
    
        System.out.printf("b-- - %d b - %d%n",b--,b); /// b is incremented after printing
      
        System.out.printf("--b - %d b - %d%n",--b,b); /// is incremented before printing
    }
}