//Q 4. Write a java program to enter length and breadth of a rectangle and find its area. Formula - area= length * breadth;
 
public class AreaOfRectangle 
{
	public static void main(String x[])
	{
		int area;
		int length = Integer.parseInt(x[0]);
		int breath = Integer.parseInt(x[1]);
		
		area = length * breath;
		System.out.println("Area of Rectangle: " + area);
	}
}
