//Q7. Write a java program to find the sum of all even numbers between 1 to n.

import java.util.*;
public class EvenNo
{
	public static  void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		int i = 1 , sum = 0;
		while ( i <= n)
		{
			while ( i % 2 == 0)
			{
			
			System.out.println( sum += i );
						break;
			}
			i++;
		}
		System.out.println("sum = " +sum);
	}
}


   /*or
int i = 0 , sum = 0;
		while ( i <= n)
		{
			if ( i % 2 == 0)
			{
			
		    sum += i ;
			}
			i++;
		} */