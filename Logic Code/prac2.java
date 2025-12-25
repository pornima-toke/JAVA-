//2. Check if a number is even or odd.
import java.util.*;
public class prac2
{
	public static void main( String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if( n % 2 == 0)
		{
			System.out.println("Even Number");
		}
		else
			{
				System.out.println("Odd Number");
			}
	}
}		
