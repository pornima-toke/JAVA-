/*17. Calculate Sum of Digits
Create a class DigitSumCalculator with a method calculateSum that computes the sum of digits of a number.
Explanation: Practices loops for digit extraction.*/
import java.util.*;
class DigitSumCalculate {
	public int calculateSum(int number) {
		int sum = 0;
		while (number != 0){
			sum += number % 10;
			number = number / 10;
		}
		return sum;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();

		DigitSumCalculate dsc = new DigitSumCalculate();
		int result = dsc.calculateSum(num);

		System.out.println("Sum of digits = " + result);
	}
}