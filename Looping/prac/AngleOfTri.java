//Q3. Write a java program to enter two angles of a triangle and find the third angle. 
import java.util.*;
public class AngleOfTri
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Angle 1 :");
		int angle1 = sc.nextInt(); 
		
		System.out.println("Enter Angle 2 :");
		int angle2 = sc.nextInt();
		
		int sum = 180 - (angle1 + angle2);   // 180`- angle1 + angle2
		System.out.println("Third angle :" + sum );
	}
}