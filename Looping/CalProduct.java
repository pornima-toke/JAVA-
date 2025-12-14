//Q12. Write a java program to calculate the product of digits of a number.

import java.util.*;
public class CalProduct
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		int n = 137;
		int temp;
		int product = 1;
		while(0 < n)
		{
			temp = n % 10;
			n = n / 10; 
			product = product * temp;
		}
		System.out.println(product);
		
	}
}