import java.util.Scanner;

public class findGrades {
    public static void main(String[] args) {

        System.out.println("This program will calculate the weighted average of your grades to find your final grade");

        System.out.println("How many points out of 10 did you receive on the first quiz?");
        Scanner userInput = new Scanner(System.in);
        double quiz1 = (userInput.nextDouble());

        System.out.println("How many points out of 10 did you receive on the second quiz?");
        double quiz2 = (userInput.nextDouble());

        System.out.println("How many points out of 100 did you receive on the midterm exam?");
        double examM = (userInput.nextDouble());

        System.out.println("How many points out of 100 did you receive on the final exam?");
        double examF = (userInput.nextDouble());

        calculateGrades newGrade = new calculateGrades(quiz1, quiz2, examM, examF);
        System.out.println("This is the final numeric grade: " + newGrade.gradeNumeric());
        System.out.println("This is the final letter grade: " + newGrade.finalGrade());
        userInput.close();

        /*
         * calculateGrades testGrade = new calculateGrades(3, 3, 65, 90);
         * System.out.println("This is the final numeric grade: " +
         * testGrade.gradeNumeric());
         * System.out.println("This is the final letter grade: " +
         * testGrade.finalGrade());
         */

    }
}
