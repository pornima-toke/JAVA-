/*Q 5. Write a java program to enter radius of a circle and find its diameter,area and circumference.
Formula :-
diameter=2 * radius;
circumference = 2 * 3.14 * radius; area = 3.14 * radius * radius; */
import java.util.*;
public class Circle
{
	public static void main(String x[])
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a No");
	 float radius = sc.nextFloat();
	 float dimeater = 2f * radius;
	 float circumference = 2f* 3.14f * radius;
	 float area = 3.14f * radius * radius;
	 System.out.println("dimeter " + dimeater + "circumference" +circumference + "area" + area);
	}
}