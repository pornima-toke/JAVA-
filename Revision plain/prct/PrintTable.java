//4. Write a program to input numbers and print its table?
import java.util.*;
public class PrintTable
{
  public static void main(String x[])
  {
    Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number:");
	int n = sc.nextInt();
	// looping
	for(int i = 1; i <= 10; i++)
	{
	   int table = i * n;
	   System.out.println(table);
	}
   }
}