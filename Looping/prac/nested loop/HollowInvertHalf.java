import static java.lang.System.out;
public class HollowInvertHalf
{ 
   public static void main(String x [])
   {
        for (int i = rows; i >= 1; i--)  
		{
            for (int j = 1; j <= i; j++)
			{
                if (j == 1 || j == i || i == rows)
                    System.out.print(" * ");
                else
                    System.out.print("  ");
             }
            System.out.println();
	    }
    }
}
