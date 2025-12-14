//1. Write a Java program to check whether a number is even or odd.
import java.util.Scanner;

public class QuadrantFinderDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x-coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y-coordinate: ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Quadrant I");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrant II");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrant III");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrant IV");
        } else {
            System.out.println("Axis");
        }
    }
}
