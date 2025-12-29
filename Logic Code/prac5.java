//Check if a given year is a leap year.

import java.util.*;
public class prac5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int year = sc.nextInt();
		
		if((year% 400 == 0) || (year % 4 == 0 && year % 100 != 0))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}
}