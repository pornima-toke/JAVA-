import java.util.Scanner;

public class PalindromeCheck {

    // Function to check if a number is palindrome
    public static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;         // extract last digit
            reverse = reverse * 10 + digit; // build reverse number
            n = n / 10;                 // remove last digit
        }

        return (original == reverse);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Function call
        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome.");
        } else {
            System.out.println(num + " is NOT a Palindrome.");
        }
    }
}
