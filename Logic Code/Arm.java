//Armstrong number
import java.util.*;
public class Arm 
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		int temp = n;
		int count = 0;
		
		
		int sum = 0;
		
		//count
		while( n > 0)
		{
			n = n / 10;
			count++;
		}
		//power
	
		n = temp;
		
		while(n > 0)
		{
			int a = n % 10;
			int p = 1;
			
			for(int i=1; i <= count; i++)
			{
				p = p * a;
			}
			System.out.println("power:" + p);
			n = n / 10;
			//sum
			sum = sum + p;
			System.out.println("Sum:"+sum);

		}
		
		//check 
		if( sum == temp)
		{
			
			System.out.println("Armstrong number");
		}
		else 
		{
			System.out.println(" Not Armstrong number");
		}
	}
}