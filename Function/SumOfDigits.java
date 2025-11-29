// Program to calculate sum of digits of a number
import java.util.*;

public class SumOfDigits {
    
    // Function to calculate sum of digits
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;   // extract last digit
            sum = sum + digit;    // add digit to sum
            n = n / 10;           // remove last digit
        }
        return sum; // return total sum
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Call function
        int result = sumOfDigits(num);

        // Display result
        System.out.println("Sum of digits = " + result);
    }
}
