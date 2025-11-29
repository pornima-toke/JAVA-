//6. Write a program to input numbers and check if the number is duck or not?

import java.util.*;
public class CheckDuckNo
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		boolean f = false;
		int num = n;
		
		while(num > 0)
		{
			int a = num % 10;
			if ( a == 0)
			{
				f = true;
				break;
			}
			num = num / 10;
		}
		if (f)
            System.out.println("Duck Number");
        else
            System.out.println("Not Duck Number");
    }
}
