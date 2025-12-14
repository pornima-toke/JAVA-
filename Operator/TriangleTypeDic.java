//Q3. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.
import java.util.Scanner;

public class TriangleTypeDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three sides
        System.out.print("Enter side a: ");
        int a = sc.nextInt();

        System.out.print("Enter side b: ");
        int b = sc.nextInt();

        System.out.print("Enter side c: ");
        int c = sc.nextInt();

        // Check triangle type
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
