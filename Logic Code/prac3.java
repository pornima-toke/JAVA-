//3. Check if a number is divisible by 5.
import java.util.*;
public class prac3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if (n % 5 == 0)
		{
			System.out.print("Yes");
		}
		else
		{
			System.out.print("No");
		}
	}
}