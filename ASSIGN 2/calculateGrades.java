public class calculateGrades {

    private double quiz1Points, quiz2Points, examMPoints, examFPoints;

    public calculateGrades(double grade1, double grade2, double grade3, double grade4) {
        if (grade1 < 0 || grade1 > 10) {
            System.out.println("Invalid first quiz score. Enter a score between 0 and 10 points");
            System.exit(0);
        } else {
            quiz1Points = grade1;
        }
        if (grade2 < 0 || grade2 > 10) {
            System.out.println("Invalid second quiz score. Enter a score between 0 and 10 points");
            System.exit(0);
        } else {
            quiz2Points = grade2;
        }
        if (grade3 < 0 || grade3 > 100) {
            System.out.println("Invalid midterm score. Enter a score between 0 and 10 points");
            System.exit(0);
        } else {
            examMPoints = grade3;
        }
        if (grade4 < 0 || grade4 > 100) {
            System.out.println("Invalid final exam score. Enter a score between 0 and 10 points");
            System.exit(0);
        } else {
            examFPoints = grade4;
        }
    }

    public double gradeQuiz1Weighted() {
        return quiz1Points * 1.25;
    }

    public double gradeQuiz2Weighted() {
        return quiz2Points * 1.25;
    }

    public double gradeMidtermExamWeighted() {
        return examMPoints * 0.25;
    }

    public double gradeFinalExamWeighted() {
        return examFPoints * 0.5;
    }

    // under adds to 100
    public double gradeNumeric() {
        return gradeQuiz1Weighted() + gradeQuiz2Weighted() + gradeMidtermExamWeighted() + gradeFinalExamWeighted();
    }

    public String finalGrade() {
        if (gradeNumeric() >= 90) {
            return "A";
        } else if (gradeNumeric() < 90 && gradeNumeric() >= 80) {
            return "B";
        } else if (gradeNumeric() < 80 && gradeNumeric() >= 70) {
            return "C";
        } else if (gradeNumeric() < 70 && gradeNumeric() >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
