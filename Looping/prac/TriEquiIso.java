// Q7. Write a Java program to check whether a triangle is equilateral , isoscale or scalene.  
import java.util.*;
public class TriEquiIso
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter side a: ");
        int a = sc.nextInt();

        System.out.print("Enter side b: ");
        int b = sc.nextInt();

        System.out.print("Enter side c: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}