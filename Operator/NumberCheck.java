//Q34. Write a Java program to check whether a number is positive , negative or zero.
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for input

        System.out.print("Enter a number: ");
        int num = sc.nextInt();  // Read an integer from user

        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
