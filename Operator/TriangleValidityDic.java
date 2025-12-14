//Q2. Write a Java program to check whether a triangle is valid or not.
import java.util.Scanner;

public class TriangleValidityDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three sides
        System.out.print("Enter side a: ");
        int a = sc.nextInt();

        System.out.print("Enter side b: ");
        int b = sc.nextInt();

        System.out.print("Enter side c: ");
        int c = sc.nextInt();

        // Check validity using triangle inequality rule
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
}
