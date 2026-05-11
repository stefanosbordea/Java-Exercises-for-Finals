import java.util.Scanner;

public class exercise10j {
    public static void main(String[] args) {
        String realUsername = "stefanos6";
        String realPassword = "123456";

        Scanner input = new Scanner(System.in);

        for (int i = 0; i <3; i++) {
            System.out.print("Enter a username: ");
            String username= input.nextLine();

            System.out.println("Enter password: ");
            String password = input.nextLine();
            try {
                 if (username.equals(realUsername) && password.equals(realPassword)) {
                System.out.println("Acces Granted");
                return;
            } else {
                throw new AuthException("Invalid credentials");
            }
            } catch (AuthException e) {
                System.out.println(e.getMessage());
            }
           
        }
     
    }
}