//Q25. Write a java program to check whether number is palindrome or not. 
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;  // Save original number for comparison
        int reverse = 0;

        // Reverse the number using loop
        while (number != 0) {
            int digit = number % 10;        // extract last digit
            reverse = reverse * 10 + digit; // add digit to reversed number
            number = number / 10;           // remove last digit
        }

        // Compare original and reversed number
        if (original == reverse) {
            System.out.println(original + " is a Palindrome Number");
        } else {
            System.out.println(original + " is NOT a Palindrome Number");
        }
    }
}
