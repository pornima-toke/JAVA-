//Q11. Write a java program to calculate the sum of digits of a number.
import java.util.*;
public class SumDigitNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		//System.out.println("Enter a Digit");
		//int n = sc.nextInt();
		
		int n = 137;
		int sum  = 0;
		int temp = 0;n
		while(0 < n)
		{
			temp = n % 10;
		      n = n / 10;
			  sum = temp + sum;
		}
			System.out.println(sum);

	}
}
			
		
		
		
	/*	
		
		
		int n = 149;
		int sum = 0;
		int temp = 0;
		while(n > 0 )
		{
			temp = n % 10;
			n = n / 10;
			sum = sum + temp;
		}
		System.out.println(sum);
	}
}*/