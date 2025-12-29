//Check if a number is divisible by both 3 and 5.

import java.util.*;
public class prac4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if(n % 3 == 0 && n % 5 == 0)
		{
			System.out.println("Divisible by both 3 and 5");
		}
		else
		{
			System.out.println("Not divisible");
		}
	}
}
