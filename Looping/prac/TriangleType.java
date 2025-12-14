//Q3. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.

import java.util.*;

public class TriangleType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the a");
		int a = sc.nextInt();
		
		System.out.println("Enter the b");
		int b = sc.nextInt();
		
		System.out.println("Enter the c");
		int c = sc.nextInt();
		
		if (a == b && b == c)
		{
         System.out.println("Equilateral Triangle");
        } else if (a == b || b == c ||a == c) {
         System.out.println("Isosceles Triangle");
		} else {
			System.out.println("Scalene Triangle");
		}
	
	}
}