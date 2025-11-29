//9. Write a program to check if a number is prime or not?
import java.util.*;
public class CheckPrime
{
	public static  void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		boolean f = false;
		for(int i = 2; i <= n; i++)
		{
			if(n % 2 != 0)
			{
				f = true;
				break;
			}
		}
		if (f) 
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
}