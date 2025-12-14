//Q14. Write a java program to check whether a number is palindrome or not.

import java.util.*;
public class NumPalin {
	public static void main(String x []){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
        int original = num, reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        if (original == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
}
