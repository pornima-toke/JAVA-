/*15. Swap Two Numbers
Create a class Swapper with a method swap that swaps the values of two numbers without using a third variable.
Explanation: Covers mathematical operations for swapping*/
import java.util.*;
class Swapper {
	public void swap (int a, int b){
		System.out.println("Before Swap : a = " + ", b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swap: a = " + a + " , b = " + b);
	}
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number (a):");
		int num1 = sc.nextInt();

		System.out.print("Enter second number (b):");
		int num2 = sc.nextInt();
		Swapper sw = new Swapper();
		sw.swap(num1, num2);
	}
}