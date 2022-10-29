import java.util.Scanner;

public class yesBoolean {
public static void main(String[] args) {
    System.out.println("y and yes are true everything else is false");
    //ask for numbers
    try (Scanner keyboard = new Scanner(System.in)) {
        System.out.println("Enter your response");
        boolean x = false;
        String input = keyboard.next();
        // to make it so capitals work replace the if statement with if(response.equals("yes") || response.equals("y")|| response.equals("Yes") || response.equals("Y"))
            if(input.equals("yes") || input.equals("y")) {
                x = true;
            }
            else {
                x = false;
            }
        System.out.println(x);
        }
    }
}

