//6.Write a C program to find the sum of all natural numbers between 1 to n.

import java.util.*;
public class SumNatNo{
	public static void main(String x []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int sum = 0, i = 1;
		while (i <= n) {
			sum += i;
			i++;
		}
	   System.out.println("Sum = " + sum);		 
    }
}
      