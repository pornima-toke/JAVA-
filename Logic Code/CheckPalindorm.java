//Q14. Write a java program to check whether a number is palindrome or not.
import java.util.*;
public class CheckPalindorm
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int rev = 0;
		int store = n;
		while(n > 0)
		{
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n /10;
		}
		if(store == rev)
		{
            System.out.println("Palindrome number");
        }
		else
		{
            System.out.println("Not a palindrome number");
		}
	}
}