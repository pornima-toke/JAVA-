//Q8. Write a java program to find the sum of all odd numbers between 1 to n.

import java.util.*;
public class OddNoSum
{
	public static void main (String x [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int i = 1 , sum = 0;
		while (i <= n)
		{
			if(i % 2 == 1) 
			{
				System.out.println( i );
			}
			i++;
		}
	}
}