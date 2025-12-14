//Q5. Write a java program to print all odd numbers between 1 to 100.

import java.util.*;
public class OddNum 
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);/*
		int i = 1;
		int n = 100;           //1 = Odd
		while (i <= n)
			{
			while (i % 2 == 1) 
			   {
				   System.out.println( i );
				     break;
			   }
			   i++;
            }
	}
}	*/
				
			System.out.println("\nHollow Rectangle:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 3 || j == 1 || j == 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }	
	}
}