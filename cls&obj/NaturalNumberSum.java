/*20. Calculate Sum of 1 to Nth Natural Numbers
Create a class NaturalNumberSum with a method calculateSum that computes the sum of the 1 to Nth natural numbers.
Explanation: Reinforces loops and arithmetic series formula. */

import java.util.*;
class NaturalNumberSum {
	 // Method to calculate sum using formula
	public int calculateSum(int n) {
		return (n * (n + 1)) / 2; // formula for sum of first N natural numbers
	}

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of N:");
		int n = sc.nextInt();

		NaturalNumberSum nns = new NaturalNumberSum();
		int sum = nns.calculateSum(n);

		System.out.println("Sum of first " + n + " natural numbers = " + sum);
	}
}