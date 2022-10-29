import java.util.Scanner;

public class chocolateCoupon {
    public static void main(String[] args) {
        double dollars, probability;
        int coupons  = 0;
        int chocolate = 0;
        try (Scanner input = new Scanner(System.in)) {
         System.out.println("Welcome to the free chocolate bar calculator.");
         System.out.println("Each chocolate bar is $1.00. You need 6 coupons to get a free chocolate bar.");
         System.out.println("Enter how much money you have in $.");

         dollars = input.nextDouble();

         if (dollars<0) {
            System.out.println("You must enter a positive amount of money.");
         } else {
            System.out.println("You have $"+dollars);
         }

         System.out.println("Enter the probability of gaining a coupon in %.");

         probability = input.nextDouble();

         if (probability<0) {
            System.out.println("You must enter a positive percentage.");
         } else if (probability > 100) {
            System.out.println("Your percentage must be lower than or equal to 100%");  
         } else {
            System.out.println("The percentage of gaining a coupon is "+probability+"%.");
         }

        do {
            dollars--;
            chocolate++;
            int chance = (int)(Math.random()*101);

            if (chance != 0 && chance < probability) {
                coupons++;
                System.out.println("You've gotten a coupon"); 
            } else {
            }

            if (coupons%6 == 0) {
                chocolate++;
                coupons = 0;
                System.out.println("You've gotten a free chocolate bar"); 
            }else {
            }

            System.out.println("You have "+chocolate+" chocolate bars."); 
        }
        while (dollars >= 1); 
        }
    }
}