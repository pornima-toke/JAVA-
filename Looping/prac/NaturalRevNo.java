//2.Write a C program to print all natural numbers in reverse (from n to 1). - using while loop

import java.util.*;
public class NaturalRevNo {
	public static void main(String x []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n");
		int n = sc.nextInt(); 
		
		while (n >= 1) {
			System.out.println(n + " ");
			n--;
		}
	}
}
