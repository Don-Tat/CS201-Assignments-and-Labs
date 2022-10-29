import java.util.Scanner;
import java.util.Arrays;
import java.lang.Character;

public class palindrome {
    public static void main(String args[]) {
        String input, phrase;
        Scanner keyboard = new Scanner(System.in);
        Scanner check = new Scanner(System.in);
        System.out.println("This program will test whether what you enter is a palindrome.");
        Character choice = null;
        do {
            System.out.println("Enter text followed by a period");
            phrase = keyboard.nextLine();
            input = phrase.toLowerCase().replaceAll(" ", "");
            input = input.replace(".", "");

            int length = input.length();

            System.out.println(input);

            if (length > 80) {
                System.out.println();
                System.out.println("Too many characters: maximum is 80");
            } else {
                char[] array = input.toCharArray();
                int arraySize = array.length;
                char[] arrayTemp = Arrays.copyOf(array, arraySize);
                for (int i = 0; i < arraySize / 2; i++) {
                    char temp = array[i];
                    array[i] = array[arraySize - i - 1];
                    array[arraySize - i - 1] = temp;
                }
                if (Arrays.equals(array, arrayTemp)) {
                    System.out.println("Palindrome");
                    input = null;
                    phrase = null;
                } else {
                    System.out.println("Not a Palidrome");
                    input = null;
                    phrase = null;
                }
            }
            System.out.println("Would you like to test another string (y/n)");
            choice = check.next().charAt(0);
            choice = Character.toLowerCase(choice);
        } while (choice != 'n');
        keyboard.close();
        check.close();
    }
}