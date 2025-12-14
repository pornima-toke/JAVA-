//Q19. Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — using nested ternary operators.
import java.util.Scanner;

public class ScoreCategoryDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the score
        System.out.print("Enter score (out of 100): ");
        int score = sc.nextInt();

        // Use nested ternary operators to determine the result
        String result = (score >= 90) ? "Excellent" :
                        (score >= 75) ? "Good" :
                        (score >= 50) ? "Average" : "Poor";

        // Print the result
        System.out.println("Result: " + result);

        sc.close();
    }
}
