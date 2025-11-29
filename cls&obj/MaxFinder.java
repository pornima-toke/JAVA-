/*6. Find the Maximum of Three Numbers
Create a class MaxFinder with a method findMax that returns the largest of three numbers.
Explanation: Enhances problem-solving using conditional statements.
*/
import java.util.*;
class MaxFinder {
	public int findMax(int a, int b, int c) {
		if(a >= b && a >= c){
			return a;
		} else if (b >= a && b> c){
			return b;
		} else {
			return c;
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number:");
		int num1 = sc.nextInt();

		System.out.print("Enter second number:");
		int num2 = sc.nextInt();

		System.out.print("Enter third number:");
		int num3 = sc.nextInt();

		MaxFinder mf = new MaxFinder();
        int max = mf.findMax(num1, num2, num3);

        // Display result
        System.out.println("Maximum number is: " + max);
	}
}