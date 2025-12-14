import static java.lang.System.out;
public class FullPyramide
{
    public static void main(String x[])
    {
        for(int i = 1; i <= 6; i++)  // Outer loop for rows
        {
            boolean flag = true;
            for(int j = 1; j <= 11; j++)  // Inner loop for columns
            {
                if(j >= 7 - i && j <= 5 + i && flag)
                {
                    System.out.printf("*");
                    flag = false;
                }
                else
                {
                    System.out.printf(" ");
                    flag = true;
                }
            }
            System.out.printf("\n");
        }
    }
}
