import java.util.Scanner;

public class firstWord {
    public static void main(String[] args) {
        System.out.println("This program will find the first word of a sentence.");
            try (Scanner input = new Scanner(System.in)) {
                System.out.println("Enter your sentence.");
                String sentence = input.nextLine();
                //I took the "String result = str.replaceAll("\\p{Punct}", "");" from this site https://www.delftstack.com/howto/java/how-to-remove-punctuation-from-string-in-java/
                String result = sentence.replaceAll("\\p{Punct}", "");
                int whitespace = result.indexOf(" ");
                System.out.println("First word is: " + result.substring(0, whitespace));
            }
        }
    }

