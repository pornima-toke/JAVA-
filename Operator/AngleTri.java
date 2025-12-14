//Q9. Write a java program to enter two angles of a triangle and find the third angle. 
import java.util.*;
public class AngleTri
{
	public static void main(String x[])
	{ 
        Scanner sc = new Scanner(System.in);

        // Input the first and second angles
        System.out.print("Enter first angle of the triangle: ");
        int angle1 = sc.nextInt();

        System.out.print("Enter second angle of the triangle: ");
        int angle2 = sc.nextInt();

        // Calculate third angle using the formula
        int angle3 = 180 - (angle1 + angle2);

        // Output the third angle
        System.out.println("The third angle of the triangle is: " + angle3);
    }
}
