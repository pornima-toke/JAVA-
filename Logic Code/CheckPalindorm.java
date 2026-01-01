//Q14. Write a java program to check whether a number is palindrome or not.
import java.util.*;
public class CheckPalindorm
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		while(n > 0)
		{
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}
		if(temp == rev)
		{
			System.out.println("Palindrom");
		}
		else{
			System.out.println("Not Palindrom");
		}
	}
}