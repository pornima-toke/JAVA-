//9.Write a C program to print a multiplication table of any number.

import java.util.*;
public class PrtMulTable {
	public static void main(String x []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt() , i = 1;
		while (i <= 10) {
			System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}

			
		