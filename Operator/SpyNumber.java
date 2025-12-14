//Q26. Write a java program to Check Number Is Spy Number or Not.
//Example :
import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int product = 1;
        int temp = number;

        // Step 2: Process each digit
        while (temp != 0) {
            int digit = temp % 10;    // Get the last digit
            sum += digit;             // Add digit to sum
            product *= digit;         // Multiply digit to product
            temp /= 10;               // Remove last digit
        }

        // Step 3: Check if number is a Spy Number
        if (sum == product) {
            System.out.println(number + " is a Spy Number");
        } else {
            System.out.println(number + " is NOT a Spy Number");
        }
    }
}
