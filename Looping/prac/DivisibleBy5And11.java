//Q5. Write a Java program to check whether a number is divisible by 5 and 11 or not.

import java.util.*;
 public class DivisibleBy5And11 {
	 public static void main (String[] args)
	 {
		 Scanner sc = new Scanner (System.in);
		 
		 System.out.println("Enter the number");
		 int num = sc.nextInt();
		 
		 if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("Divisible by both 5 and 11");
        } else {
            System.out.println("Not divisible by both 5 and 11");
        }
    } 
}
			 