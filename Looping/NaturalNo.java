//Q1. Write a java program to print all natural numbers from 1 to n. using while loop

import java.util.*;
public class NaturalNo {
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number");
		//int n = sc.nextInt();
		int i = 0;
		int n = 10;
		while ( i <= n ) {
			System.out.print( i );
			i++;
		}
	}
}	