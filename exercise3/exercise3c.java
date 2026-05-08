import java.util.ArrayList;
import java.util.Scanner;

public class exercise3c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        int length = sentence.length();
        String[] words = sentence.split(" ");

        String firstWord = words[0];

        String reverseSentence = "";
        for (int j = words.length-1; j>=0; j--) {
            for (int i = words[j].length()-1; i>=0; i--) {
                reverseSentence += words[j].charAt(i);
            }
            reverseSentence += " ";
        }

        System.out.printf("Total sentence length - %d%n",length);
        System.out.printf("First word - %s%n",firstWord);
        System.out.printf("Reverse sentence - %s%n",reverseSentence.trim());
    }
}