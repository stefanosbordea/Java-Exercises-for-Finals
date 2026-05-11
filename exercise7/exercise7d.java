import java.util.Scanner;
import java.util.ArrayList;

public class exercise7d {
    public static int countVowels(String s) {
        ArrayList<String> vowels = new ArrayList<>();
        vowels.add("a");
        vowels.add("e");
        vowels.add("i");
        vowels.add("o");
        vowels.add("u");

        String[] words = s.toLowerCase().split(" ");
        int vowelCount = 0;

        for (int j = 0; j < words.length; j++) {
            for (int i = 0; i<words[j].length(); i++) {
                char character = (char) words[j].charAt(i);
                if (vowels.indexOf(character) != -1) {
                    vowelCount++;
                }else {
                    continue;
                }
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String n = input.nextLine();

        System.out.printf("Vowel count - %d",countVowels(n));
    }
}