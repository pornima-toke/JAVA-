//2. Write a program to input numbers using Scanner class and reverse it?
import java.util.*;
public class ReverseNumber 
{
	public static void main(String x [])
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt(), rev = 0;
		while (n > 0) 
		{
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		System.out.println("Reversed: " + rev);
	}
}
