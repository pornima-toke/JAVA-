import static java.lang.System.out;
public class Rectangle
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 4; i++) //outer
		{
			for(int j = 1; j <= 5; j++) //inner
			{
				if (i==1 || j==1 || i==4 || j==5) //condition in  1 to 4 row print and 1 to 5 col print
				{
				System.out.print("* ");
				} else {   //space *   *
					System.out.print("  "); 
				}
			}
			System.out.println(); //new line
		}
	}
}