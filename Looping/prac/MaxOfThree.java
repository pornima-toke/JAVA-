// Q11. Write a java program to find a maximum between three numbers.

import java.util.*;
public class MaxOfThree {
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter first number");
		  int a = sc.nextInt();
		  
		  System.out.println("Enter second number");
		  int b = sc.nextInt();
		  
		  System.out.println("Enter third number");
		  int c = sc.nextInt();
		  
		  if (a >= b && a >= c) {
            System.out.println("Maximum is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Maximum is: " + b);
        } else {
            System.out.println("Maximum is: " + c);
        }
    }
}
