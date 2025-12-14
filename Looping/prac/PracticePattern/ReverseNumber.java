import java.util.Scanner;

public class ReverseNumber {

    // Function to reverse a number
    public static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;        // extract last digit
            rev = rev * 10 + digit;    // add digit to reversed number
            n = n / 10;                // remove last digit
        }
        return rev;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Function call
        int result = reverseNumber(num);

        // Output
        System.out.println("Reverse of " + num + " is: " + result);

        sc.close();
    }
}
