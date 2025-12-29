//Q12. Write a java program to calculate the product of digits of a number.
import java.util.*;
public class CalProductDigit
{
	public static  void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int product = 1;
		while( n > 0)
		{
			int digit = n % 10;
			product = product * digit;
			n = n / 10;
		}
		System.out.println("Calculate product:-" + product);
	}
}
			