// Q12. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
import java.util.Scanner;

public class VotingEligibilityDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Check voting eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
