//Q14. Write a java program swap two number using third variable.

import java.util.*;
public class StwoNumber{
	public static void main(String x[])
	{Scanner sc = new Scanner (System.in);
	System.out.println("Enter the two number");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c;
	
	c = a;
	a= b;
	b = c;
	
	System.out.printf( "% d %d " , a , b);
		}
}
