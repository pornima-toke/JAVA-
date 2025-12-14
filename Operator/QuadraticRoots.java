/*Q28. Write a java program to find all roots of a quadratic equation using if else. How to find all roots of a quadratic equation using if else in java programming.
 
Example
Input a: 8 ,  b: -4 , c: -2
Output Root1: 0.80
Root2: -0.30
*/
import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coefficients a, b, c
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Calculate discriminant
        double discriminant = b * b - 4 * a * c;

        // Check nature of roots using if-else
        if (discriminant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Root1: %.2f\n", root1);
            System.out.printf("Root2: %.2f\n", root2);
        } else if (discriminant == 0) {
            // Two real and equal roots
            double root = -b / (2 * a);
            System.out.printf("Both roots are equal: %.2f\n", root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("Root1: %.2f + %.2fi\n", realPart, imaginaryPart);
            System.out.printf("Root2: %.2f - %.2fi\n", realPart, imaginaryPart);
        }

        sc.close();
    }
}
