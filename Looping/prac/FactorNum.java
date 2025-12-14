//Q17. Write a java program to find all factors of a number.

import java.util.*;
public class FactorNum {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Factors of " + num + ":");
		
        int i = 1;
        while (i <= num) {
            if (num % i == 0)
                System.out.print(i + " ");
            i++;
        }
    }
}