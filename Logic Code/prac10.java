//Q11. Write a java program to calculate the sum of digits of a number.
import java.util.*;
public class prac10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();	
		int sum = 0;
		while(n > 0)
		{
			int digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		System.out.println("Sum of digit:" + sum);
	}
}
			 