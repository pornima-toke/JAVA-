import java.util.Scanner;

public class SumOfDigits {

    // Function to calculate sum of digits
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;   // extract last digit
            sum += digit;         // add to sum
            n = n / 10;           // remove last digit
        }
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Function call
        int result = sumOfDigits(num);

        // Output
        System.out.println("Sum of digits of " + num + " is: " + result);

        sc.close();
    }
}
