//Q47. Write a java program to find the maximum between two numbers.
import java.util.Scanner;

public class MaximumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();  // Read first number

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();  // Read second number

        if (num1 > num2) {
            System.out.println("Maximum is: " + num1);
        } else if (num2 > num1) {
            System.out.println("Maximum is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
