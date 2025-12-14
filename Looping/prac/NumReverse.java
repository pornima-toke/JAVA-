//Q13. Write a java program to enter a number and print its reverse

import java.util.*;
public class NumReverse {
	public static void main(String x []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int reverse = 0;
		while(num > 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
        System.out.println("Reversed number: " + reverse);
    }
}
