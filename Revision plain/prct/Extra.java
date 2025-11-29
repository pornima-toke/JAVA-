import java.util.*;
public class Extra
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int even = 0, odd = 0;
		while(num > 0)
		{
			int digit = num % 10;
			if(digit % 2 == 0)
				even++;
			else
				odd++;
			    num /= 10;
		}
		System.out.println("Even count:" +even);
		System.out.println("Odd count:" +odd);
	}
}
