//Check Prime Number Write a function isPrime(int n) that checks if a number is prime or not. Use it in main() to test different inputs.
import java.util.*;
public class PrimeCheck {
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= n /2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String x []) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter a number ");
		int num = sc.nextInt();
		if (isPrime(num)) {
			System.out.println(num + "is a Prime number");
		} else {
			System.out.println(num + "is NOT a Prime number");
		}
	}
}