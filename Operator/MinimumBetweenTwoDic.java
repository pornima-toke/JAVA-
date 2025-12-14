//Q15. Write a java program to find the minimum between two numbers.
 import java.util.Scanner;

public class MinimumBetweenTwoDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Compare the two numbers to find the minimum
        if (num1 < num2) {
            System.out.println("Minimum number is: " + num1);
        } else if (num2 < num1) {
            System.out.println("Minimum number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        sc.close();
    }
}

