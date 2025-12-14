//Q4. Write a java program to print all even numbers between 1 to 100.- using while loop

import java.util.*;
public class EvenNum {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		//int = sc.nextInt(); only use in number in type
		 int i = 2;
		while(i <= 100) {
			System.out.println(i + " ");
			i++;   
		}
	}
}