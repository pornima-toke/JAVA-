/*Q21. Write a java program to check whether a number is neon or not.      	
        	Input : 9
        	Output : Neon Number
        	Explanation: square is 9*9 = 81 and
        	The sum of the digits of the square is 9.   */
import java.util.Scanner;

public class NeonNumberCheckDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Step 1: Find square of the number
        int square = num * num;

        // Step 2: Calculate sum of digits of the square
        int sum = 0;
        while (square > 0) {
            int digit = square % 10; // get last digit
            sum += digit;            // add digit to sum
            square /= 10;            // remove last digit
        }

        // Step 3: Check if sum is equal to the original number
        if (sum == num) {
            System.out.println(num + " is a Neon Number");
        } else {
            System.out.println(num + " is Not a Neon Number");
        }

        sc.close();
    }
}
			