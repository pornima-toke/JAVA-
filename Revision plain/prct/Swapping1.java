//1. Write a program to input two values using command line argument and perform its swapping?
public class Swapping1
{
	public static void main(String x[])
	{
		//command line
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		
		//Swapping logic 
		a = a + b;
		b = a - b;
		a = a - b;
		
		//Display result
		System.out.println("A=" +a + "b=" +b);
	}
}
