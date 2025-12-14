/*Q23. Write a java program to Check Number Is Spy Number or Not.
Example :
        	 A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
	 Input : 1412
	Output : Spy Number
	Explanation :
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8
	*/
import java.util.Scanner;

public class SpyNumberCheckDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, product = 1;
        int temp = num; // store original number

        // Process each digit using while loop
        while (temp > 0) {
            int digit = temp % 10;     // extract last digit
            sum += digit;              // add to sum
            product *= digit;          // multiply to product
            temp = temp / 10;          // remove last digit
        }

        // Check Spy number condition
        if (sum == product) {
            System.out.println(num + " is a Spy Number");
        } else {
            System.out.println(num + " is Not a Spy Number");
        }

        sc.close();
    }
}

