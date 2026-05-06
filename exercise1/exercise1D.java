public class exercise1D {
    public static void main(String[] args) {
        char defaultChar= 'a';

        int intChar = (int) defaultChar;

        char intToChar = (char) defaultChar;

        System.out.printf("Character = %s%n",defaultChar);
        System.out.printf("ASCII value = %d%n",intChar);
        System.out.printf("ASCII to Char = %s%n",intToChar);
    }
}