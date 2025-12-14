//Q48. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.
import java.util.Scanner;

public class PassFailCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter the student's score: ");
        int score = sc.nextInt();  // Read the score

        if (score >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
