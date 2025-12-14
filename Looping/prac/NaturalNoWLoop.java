//Q1. Write a java program to print all natural numbers from 1 to n. using while loop

import java.util.*;
public class NaturalNoWLoop {
	public static void main(String x []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number (n)");
		int n = sc.nextInt();
		int i = 1;
		System.out.println("Natural number from 1 to " + n + ":");
		while(i <= n) {
			System.out.println(i + " ");
			i++;
		}
	}
}
