//Q22. Write a program to find first and last digit of a number without using loop in three digit.and sum of first and last digit.
import java.util.*;
public class FLNuApp{
	public static void main(String x[])
	{	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int a =num%10; // last digit
		int b = num/100; // first digit 
		
		System.out.println(" a " + a +  " b " + b);
		
		int sum = a + b;
		
		System.out.println(" Sum " + sum);
		
		
		
		}
}