import java.util.*;
public class NumberChecker {
	public void isEven(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is Even.");
		} else {
			System.out.println(num + "is Odd.");
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		NumberChecker checker = new NumberChecker();
		checker.isEven(number);
	}
}