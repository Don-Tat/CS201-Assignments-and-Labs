import java.util.Scanner;

public class serviceChargeCalc {
    public static void main(String[] args) {
        System.out.println("This program will calculate your service charge.");
        double serviceCharge = 0.0;
        //ask for numbers
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter your net total.");
            double netTotal = input.nextDouble();
            if(netTotal < 10) {
            serviceCharge = 1.0;
            }
            else if(netTotal < 100) {
            serviceCharge = 0.1 * netTotal;
            }
            else if(netTotal < 1000) {
            serviceCharge = 5 + (0.05 * netTotal);
            }
            else if(netTotal > 1000) {
            serviceCharge = 40 + (0.01 * netTotal);
            }
        }
        System.out.println("Your service charge is: $"+serviceCharge);
    }
}
