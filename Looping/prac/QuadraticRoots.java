/*Q28. Write a java program to find all roots of a quadratic equation using if else. How to find all roots of a quadratic equation using if else in java programming.
 
Example
Input a: 8 ,  b: -4 , c: -2
Output Root1: 0.80
Root2: -0.30 */
import java.util.*;
public class QuadraticRoots {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = b * b - 4 * a * c;

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Root1: " + r1);
            System.out.println("Root2: " + r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("Root1 = Root2 = " + r);
        } else {
            System.out.println("Roots are imaginary");
        }
    }
}

