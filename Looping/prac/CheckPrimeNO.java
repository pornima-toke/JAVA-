//Q21.  Write a java program to check Number Is Prime Number or Not.

import java.util.*;
public class CheckPrimeNO {
	public static void main(String x[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = sc.nextInt();
			if (Prime (number)){
				System.out.println(number + "is a prime .");
			} else {
				System.out.println(number + "is not prime .");
			}
	}
}