//Q49. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50)
//— using nested ternary operators.
import java.util.Scanner;

public class ScoreGradeTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner for input

        System.out.print("Enter score out of 100: ");
        int score = sc.nextInt();  // Read score

        String result = (score >= 90) ? "Excellent" :
                        (score >= 75) ? "Good" :
                        (score >= 50) ? "Average" :
                        "Poor";

        System.out.println("Result: " + result);
    }
}
