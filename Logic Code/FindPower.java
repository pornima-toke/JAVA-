//Q16. Write a java program to find power of a number.
import java.util.*;
public class FindPower
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the  base");
		int base = sc.nextInt();
		
		System.out.println("Enter the index");
		int index = sc.nextInt();
		
		int p = 1;
		//for (int i = 1; i <= index; i++)
		while(index > 0)
		{
			p = p * base;
			index--;
		}
		System.out.println("Power is:" + p);
	}
}
		