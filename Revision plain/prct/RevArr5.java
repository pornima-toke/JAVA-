//5. Reverse an Array
import java.util.*;
public class  RevArr5
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter the value in array:");
		for(int i = 00; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Before reverse Array:");
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println("\nAfter reverse Array");
		for(int i = a.length - 1; i >= 0; i--)
		{
			System.out.print(a[i] + " ");
		}
	}
}

