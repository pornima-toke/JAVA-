//Q17. Write a java program to find the maximum between two numbers.
import java.util.Scanner;

public class MaximumBetweenTwoDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Compare the two numbers to find the maximum
        if (num1 > num2) {
            System.out.println("Maximum number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("Maximum number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}
