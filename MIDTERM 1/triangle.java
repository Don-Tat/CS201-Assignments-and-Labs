import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("This program will print a triangle of *s. enter the maximum amount of *s in a line.");

            int size = input.nextInt();

            System.out.println("Great, here is your triangle!");
    
            for (int i=0; i<size-1; i++) {
                for (int j=0; j<i; j++) {
                    System.out.print("*");
                }
                System.out.println("*");
            }
    
            for (int i=size-1; i>=0; i--) {
                for (int j=i; j>0; j--) {
                    System.out.print("*");
                }
                System.out.println("*");
            }
        }
    }
    
}
