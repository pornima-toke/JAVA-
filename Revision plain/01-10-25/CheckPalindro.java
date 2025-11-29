//7. Write a program to input numbers and check if the number is palindrome or not?
import java.util.*;
public class CheckPalindro
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt(), temp=n, rev=0;
		
        while (n > 0)
		{
			rev = rev * 10 + n % 10;
			n/=10;
		}
		
        if(temp==rev) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}