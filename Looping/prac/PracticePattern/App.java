import static java.lang.System.out;
public class App
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 4; i++) //outer
		{
			for(int j = 1; j <= 5; j++) //inner
			{
				if (i==1 || j==1) //condition in 1row print and i=1 is row and 1 col j=1 is col
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
		