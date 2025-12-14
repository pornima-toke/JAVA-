//8.Write a C program to find the sum of all odd numbers between 1 to n.


import java.util.*;
public class SumOddNum {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int i = 1, sum = 0;
        while (i <= n) {
            sum += i;
            i += 2;
        }
        System.out.println("Sum of odd numbers = " + sum);
    }
}


 /*

import java.util.Scanner;
public class SumOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int i = 1, sum = 0;

        while (i <= n) {
            sum += i;
            i += 2;
        }
        System.out.println("Sum of odd numbers = " + sum);
    }
}
*/