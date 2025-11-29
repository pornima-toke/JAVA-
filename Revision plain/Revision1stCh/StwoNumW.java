//Q14. Write a java program swap two number without using third variable.

import java.util.*;
public class StwoNumW{
	public static void main(String x[])
	{Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the two numbers");
	int a  = sc.nextInt();
	int b =sc.nextInt();
	 a = a + b;
	 b = b - a;
	 a = a- b;
	 
	 System.out.println(" a " + a + " b "  + b);
	
	
		}
}