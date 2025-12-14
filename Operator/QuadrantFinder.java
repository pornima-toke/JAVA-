//Q56. Given (x, y), print quadrant I, II, III, IV or "Axis".
import java.util.Scanner;

public class QuadrantFinder {
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
            System.out.println("Qua
