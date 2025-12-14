//Q29. Given two integers, write a Java program to find the quotient and remainder using only arithmetic operators.
//Input: dividend = 20, divisor = 3 Output: Quotient = 6, Remainder = 2
import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dividend and divisor
        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        // Calculate quotient and remainder using arithmetic operators
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Output the result
        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);
    }
}
