//Q2. Write a Java program to check whether a triangle is valid or not.

import java.util.*;
public class ValidTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the a");
		int a = sc.nextInt();
		
		System.out.println("Enter the b");
		int b = sc.nextInt();
		
		System.out.println("Enter the c");
		int c = sc.nextInt();
	
		if  (a + b + c  == 180)
		{
		System.out.println("Triangle is Valid :"); 
		} 
		else 
		{
			System.out.println("Triangle is Not Valid :");
		}
	}
}
			
		