//Q16. Write a java program to find power of a number.

import java.util.*;
public class PowerNum {
	 System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = sc.nextInt();

        int result = 1;
        int i = 1;
        while (i <= exponent) {
            result *= base;
            i++;
        }

        System.out.println("Result = " + result);
    }
}