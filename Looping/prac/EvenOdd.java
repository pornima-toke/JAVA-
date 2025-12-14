//Q1. Write a Java program to check whether a number is even or odd.
import java.util.*;

public class EvenOdd {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.printf("Enter the number");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("Even");
		}else 
		{
			System.out.println("Odd");
		}
	}
}
			