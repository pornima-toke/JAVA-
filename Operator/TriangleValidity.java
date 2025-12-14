//Q32. Write a Java program to check whether a triangle is valid or not.
import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the three sides of the triangle
        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        // Check the triangle validity using the condition
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("The triangle is VALID.");
        } else {
            System.out.println("The triangle is NOT VALID.");
        }
    }
}
