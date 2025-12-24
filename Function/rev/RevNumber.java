// Write a function to find the reverse of a number.

import java.util.*;
public class RevNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int rev = revNo(n);
		System.out.println("Reverse Numuber"+rev);
	}
	public static int revNo(int n)
	{
		int rev = 0;
		while(n > 0)
		{
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		return rev;
	}
}
	