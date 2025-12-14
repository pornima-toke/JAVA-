import static java.lang.System.out;
public class HalfPyramide
{
	public static void main(String x[])
	{
		for(int i=4; i>=1; i--) //inner loop
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}	
		