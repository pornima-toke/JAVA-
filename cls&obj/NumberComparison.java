/*3. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.
*/
import java.util.*;
public class NumberComparison {
	public void compare (int a, int b){
		if (a == b) {
			System.out.println(a + "is equal to" + b);
		} else if (a > b) {
			System.out.println(a + " is greater than" + b);
		} else {
			System.out.println(a + "is less than" + b);
		}
	}
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		NumberComparison obj = new NumberComparison();
		obj.compare(num1, num2); 
	}
}