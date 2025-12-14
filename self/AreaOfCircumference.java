/*Q 5. Write a java program to enter radius of a circle and find its diameter,area and circumference.
Formula :- diameter=2 * radius; circumference = 2 * 3.14 * radius; area = 3.14 * radius * radius;*/

public class AreaOfCircumference
{
  public static void main(String x[])
  {
	int radius = Integer.parseInt(x[0]);

     System.out.println("The Diameter of the Circle is: " + (radius*2));
     System.out.println("The Circumference of the Circle is:" + (radius*2*3.14));
     System.out.println("The Area of the Circle is:" + (3.14*radius*radius));
	}
}
