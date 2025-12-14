/*Q23. Write a program to calculate sum of first and last digit of a number without using loop.
Input : 123
Output : 4 */
import java.util.Scanner;

public class SumFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Convert number to string
        String str = String.valueOf(number);

        // Extract first digit (as char), convert to int
        int first = Character.getNumericValue(str.charAt(0));

        // Extract last digit using modulus
        int last = number % 10;

        // Calculate sum
        int sum = first + last;

        // Output the result
        System.out.println("Sum of first and last digit = " + sum);
    }
}
