/* Q20. Write a Java program and compute the sum of an integer's digits.
Input : 123
Output : 6  */
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: "); 
        int number = sc.nextInt();

        int sum = 0;  // to store sum of digits

        while (number != 0) {
            int digit = number % 10;     // extract last digit
            sum = sum + digit;           // add digit to sum
            number = number / 10;        // remove last digit
        }

        // Output the sum of digits
        System.out.println("Sum of digits = " + sum);
    }
}
