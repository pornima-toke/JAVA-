//Q10. Write a java program to calculate area of an equilateral triangle.
import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the side length of the triangle
        System.out.print("Enter the side of the equilateral triangle: ");
        double side = sc.nextDouble();

        // Apply the formula: (sqrt(3) / 4) * side * side
        double area = (Math.sqrt(3) / 4) * side * side;

        // Output the area
        System.out.println("Area of the equilateral triangle: " + area);
    }
}
