//Q22. Write a program to find first and last digit of a number without using loop in three digit.
import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a 3-digit number
        System.out.print("Enter a 3-digit number: ");
        int number = sc.nextInt();

        // Extract first and last digit
        int first = number / 100;      // removes last 2 digits
        int last = number % 10;        // gets last digit

        // Output the result
        System.out.println("First digit: " + first);
        System.out.println("Last digit: " + last);
    }
}
