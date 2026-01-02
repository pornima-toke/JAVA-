//Q17. Write a java program to find the first factors of a number.
import java.util.*;

public class Factor
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			if( n % i == 0)
			{
				System.out.println(i);
			}
		}
	}
}