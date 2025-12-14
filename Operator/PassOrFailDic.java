//Q18. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.
import java.util.Scanner;

public class PassOrFailDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the student's score
        System.out.print("Enter student's score: ");
        int score = sc.nextInt();

        // Check if the score is 40 or above
        if (score >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
