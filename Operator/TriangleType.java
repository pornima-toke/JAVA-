//Q33. Write a Java program to check whether a triangle is equilateral , isoscale or scalene. 
import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sides of the triangle
        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        // First check if the triangle is valid
        if (a + b > c && b + c > a && a + c > b) {

            // Now check the type of triangle
            if (a == b && b == c) {
                System.out.println("The triangle is Equilateral.");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }

        } else {
            System.out.println("The given sides do NOT form a valid triangle.");
        }
    }
}
