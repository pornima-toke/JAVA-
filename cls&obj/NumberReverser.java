/*11. Reverse a Number
Create a class NumberReverser with a method reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation. */
import java.util.*;
class NumberReverser {
	public int revers(int number) {
		int reversed = 0;
		while (number != 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number = number / 10;
		}
		return reversed;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number :");
		int num = sc.nextInt();

		NumberReverser nr = new NumberReverser();
		int result = nr.revers(num);
		System.out.println("Reversed number:" + result);
	}
}