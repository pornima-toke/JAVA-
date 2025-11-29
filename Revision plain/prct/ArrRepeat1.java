import java.util.*;
public class ArrRepeat1
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        int a [] = new int [n];

        System.out.println("Enter the value of array:");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        int max = 0;
        for(int i=0; i < a.length; i++)
        {
            if(a [i] > max )
            {
                max = a[i];
            }
        }
        System.out.println("Largest size:" +max);
    }
}