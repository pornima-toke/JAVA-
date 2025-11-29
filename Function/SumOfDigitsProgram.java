//Sum of Digits Write a function sumOfDigits(int n) that calculates and returns the sum of digits of a given number. Example: Input 123 → Output: 6.

import java.util.*;
public class SumOfDigitsProgram {
	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n > 0) {
		    int digit = n % 10;   // extract last digit
            sum = sum + digit;    // add digit to sum
            n = n / 10;           // remove last digit
        }

        return sum;  // return final sum
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // call the function
        int result = sumOfDigits(num);

        // display result
        System.out.println("Sum of digits of " + num + " is: " + result);
    }
}
