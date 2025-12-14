import static java.lang.System.out;
public class Paradrom
{
	public static void main(String x[])
	{
		int n = 5;
		//outer loop
		for(int i=1; i<=n; i++)
		{
			//inner loop
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			//stars
			for(int j=1; j<=5; j++)
			{
			System.out.print("*");
		}
		System.out.println();
	}
}
}