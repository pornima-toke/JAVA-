//Q13. Write a java program to enter a number and print its reverse.
import java.util.*;
public class PrintRev
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int rev = 0;
		while( n > 0)
		{
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		System.out.println("Reverse No:" + rev);
	}
}