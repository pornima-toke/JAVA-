//1. Input n and take n integers into an array; print them
import java.util.*;
public class InputArr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size");
		int n = sc.nextInt(); // size of array
		
		System.out.println("Enter the number");
		int [] a = new int [n];
		 
		 for (int i = 0; i < n; i++)
			 a[i] = sc.nextInt();
		 for (int i = 0; i < n; i++)
			 System.out.println(a[i] + " ");
	}
}	