/*12. Find Factorial of a Number
Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
Explanation: Focuses on iterative orrecursivelogic.*/
import java.util.*;
class FactorialCalculator {
	//method to compute factorial iteratively
	public long findFactorial(int number) {
		long fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter a number:");
		int num = sc.nextInt();

		FactorialCalculator fc = new FactorialCalculator();
		long result = fc.findFactorial(num);

		System.out.println("Factorial of" + num + " = " + result);
	}
}