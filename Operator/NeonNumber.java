/*Q24. Write a java program to check whether number is neon or not.
Input : 9
Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.*/
import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calculate square of the number
        int square = number * number;

        // Find sum of digits of the square
        int sum = 0;
        while (square != 0) {
            int digit = square % 10;   // extract last digit
            sum += digit;              // add to sum
            square /= 10;              // remove last digit
        }

        // Check if sum equals original number
        if (sum == number) {
            System.out.println(number + " is a Neon Number");
        } else {
            System.out.println(number + " is NOT a Neon Number");
        }
    }
}

