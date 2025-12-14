//Q42. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input

        System.out.print("Enter your age: ");
        int age = sc.nextInt();  // Read age input from the user

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }
    }
}
