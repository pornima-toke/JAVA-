//4. Write a program to input numbers and print its table?

import java.util.*;
public class InputNo 
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
	
        for(int i=1;i<=10;i++)
        System.out.println(n + " x " + i + " = " + (n*i));
	
	}
}