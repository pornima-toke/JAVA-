
import java.util.*;
public class CountNo 
{
	public static void main (String x [])
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a number");
		//int num = sc.nextInt();
		int  n = 123;
		count = 0;
		while(n > 0)
		{
			n = n / 10;
			count++;
		}
		System.out.println(count);
	}
}
	
		/*
		while(num == 0) count = 1;
		{
			while(num != 0)
			{
				num = num/10;
				count++;
			}
		}
		System.out.println("Total digits : " + count);
	}
}
*/