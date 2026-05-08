import java.util.Scanner;

public class exercise3e {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().trim();

        System.out.print("Enter a character as a target: ");
        String target = input.nextLine();

        int charCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == target.charAt(0)) {
                charCount++;
            }
        }
        System.out.println();
        System.out.printf("%s appears %d times in sentence",target,charCount);
    }
}
    