//Q12. Write a java program to calculate the product of digits of a number.

import java.util.*;
public class CalculateProduct {
	public static void main(String x []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int  num = sc.nextInt();
		int n , product = 1;        //product = 1 and sum = 0
		while(num != 0)
		{
			n = num % 10;
			System.out.println("number is "+n);
			
			num = num / 10;
		System.out.println("the num is" +num);
		product = product *n;
		}
		System.out.println("product of digit : " + product);
	}
}