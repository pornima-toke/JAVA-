//Q22. Write a java program to check whether a number is palindrome or not.
import java.util.Scanner;

public class PalindromeNumberCheckDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;  // Store original number
        int reverse = 0;

        // Reverse the number using while loop
        while (num > 0) {
            int digit = num % 10;      // Get last digit
            reverse = reverse * 10 + digit; // Append digit
            num = num / 10;            // Remove last digit
        }

        // Check if original number equals reversed number
        if (originalNum == reverse) {
            System.out.println(originalNum + " is a Palindrome Number");
        } else {
            System.out.println(originalNum + " is Not a Palindrome Number");
        }

        sc.close();
    }
}
