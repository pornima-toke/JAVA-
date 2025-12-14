//Q5. Write a java program to print all odd numbers between 1 to 100.

import java.util.*;
public class PrtOddNum {
	public static void main(String x [] ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		//int odd =  sc.nextInt();
        while (i <= 100) {
            System.out.print(i + " ");
            i += 2;
        }
    }
}