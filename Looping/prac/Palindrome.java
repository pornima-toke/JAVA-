//Q22. Write a java program to check whether a number is palindrome or not. 
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;   // store original number
        int reversed = 0;     // store reversed number

        // Reverse the number
        while (num > 0) {
            int digit = num % 10;           // get last digit
            reversed = reversed * 10 + digit; // add digit to reversed
            num = num / 10;                 // remove last digit
        }

        // Check palindrome condition
        if (original == reversed) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is NOT a Palindrome number.");
        }

        sc.close();
    }
}

