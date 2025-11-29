//Calculate Factorial Write a function factorial(int n) that returns the factorial of a given number. Call it from main() and display the factorial.

import java.util.*;
public class FactoriaProgram {
	public static int factorial (int n) {
		int fact = 1;
		for (int i = 1; i <=n; i++) {
			fact = fact * i;
		}
		return fact;
	} 
	public static void  main (String x[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		int result = factorial(num);
		System.out.println("Factorial of " + num + " is " + result);
	}
}
