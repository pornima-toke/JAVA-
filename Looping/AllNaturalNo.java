//Q6. Write a java program to find the sum of all natural numbers between 1 to n.

import java.util.*;
public class AllNaturalNo
 {
	public static void main(String x[]) 
	{
		Scanner sc = new Scanner(System.in); //class define 
		System.out.println("Enter a number");		
		int n = sc.nextInt();
		int i = 1 ,
		sum = 0;
		while (i <= n)
		{
			sum += i;
			i++;
		}
		System.out.println("Sum =" + sum);
	}
 }