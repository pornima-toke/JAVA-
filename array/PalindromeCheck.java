//Check Palindrome Using Two Pointers
//Check if a string is a palindrome using the two-pointer approach.
import java.util.*;
public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        int left = 0;                  // Start pointer
        int right = str.length() - 1;  // End pointer

        while (left < right) {         // Loop until pointers meet
            if (str.charAt(left) != str.charAt(right)) {
                return false;          // If mismatch → not palindrome
            }
            left++;   // Move forward
            right--;  // Move backward
        }
        return true;   // All characters matched
    }
public static void main(String[] args) {
        String str = "racecar";   // Example input

        if (isPalindrome(str)) {
            System.out.println(str + " is a Palindrome!");
        } else {
            System.out.println(str + " is NOT a Palindrome!");
        }
    }
    
}
