//Q10. Write a java program to count the number of digits in a number.

import java.util.*;
public class prac9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		//int i = 1;
		int count = 0;
		while(0 < n)
		{
	/*for(int i = 1; i <=n; i++)
		{
			count++;
			n=n/10;
		}*/
            n = n / 10;
            count++;
        }

        System.out.println(count);
    }
}