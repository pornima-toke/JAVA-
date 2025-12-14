import static java.lang.System.out;
public class FloydsTriangle
{
	public static void main(String x[])
	{
		/*
		int n = 5;
		//outer loop
		for(int i=1; i<=n; i++)
		{
			//inner loop
			for(int j=1; j<=i; j++)
			{
				System.out.print(number+"");
				number++;  
				//number = number +1
			}
			System.out.println();
		}
	}
} */
 
        int n = 5;              // number of rows
        int number = 1;         // ✅ declare variable before using

        for (int i = 1; i <= n; i++) {           // rows
            for (int j = 1; j <= i; j++) {       // columns
                System.out.print(number + " ");  // use number
                number++;                        // increase number
            }
            System.out.println();  // new line
        }
    }
}
