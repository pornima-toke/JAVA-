//Q15. Write a java program to print all ASCII characters with their values.
public class ASCIIValues
{
    public static void main(String x[])
    {
        int i;

        for(i = 0; i <= 127; i++)
        {
            System.out.println(i + " = " + (char)i);
        }
    }
}
