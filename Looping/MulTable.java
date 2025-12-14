//Q9. Write a java program to print a multiplication table of any number.

//import java.util.*;
public class MulTable
{
	public static void main (String x [])
	{
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number");
		//int n = sc.nextInt();
		int i = 1, n = 5;
		int table  ; 
		while( i <= 10)
		{
		table = i * n;  // Create Table
			System.out.printf("%d * %d = %d \n" ,i ,n , table); // %d are use in integer storage. (\n = new line) c 
			//System.out.println( i + " * " + n + " = " +table ); java 
			i++;
		}
	}
}
			