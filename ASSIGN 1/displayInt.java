import java.util.Scanner;

public class displayInt {
    public static void main(String[] args) {
        System.out.println("This program will show all of the integers between two numbers of your choosing.");
        //ask for numbers
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the smaller integer");
            int numSmall = input.nextInt();
            System.out.println("Enter the larger integer");
            int numLarge = input.nextInt();
            //add for loop i = start as long as i < end i++
            for (int i = numSmall; i <= numLarge; i++) {
                System.out.println(i + " ");
            }
        }
    }
}
