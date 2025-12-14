//Q4. Write a java program to print all even numbers between 1 to 100.- using while loop

import java.util.*;
public class EvenBetween
 {
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int n = 100;		// 0 = even  
		while(i <= n) 
		{
            while (i % 2 == 0)
				{
				System.out.println( i );
						break;
				}
             i++;
		}
	}
}	