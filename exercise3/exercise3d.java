import java.util.Scanner;

public class exercise3d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = input.nextLine().trim();

        boolean validLength = username.length()>8;
        
        System.out.printf("Longer than eight characters? - %s%n",validLength);
        System.out.printf("Username - %s%n",username);
        System.out.printf("Length - %d%n",username.length());
  
        
    }
}