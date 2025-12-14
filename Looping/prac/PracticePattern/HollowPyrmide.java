import static java.lang.System.out;
public class HollowPyrmide
{
	public static void main(String x[])
	{
		//outer loop
		for(int i = 1; i <= 4 ; i++) 
		{
			// inner loop
			for(int j = 1; j <= i; j++) // j<=i is adefine upper limite kitne star hum print karnge
			// for (i = 1 to n) and for (j =1 to i)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}	
		