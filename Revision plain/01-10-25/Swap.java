//1. Write a program to input two values using command line argument and perform its swapping?

public class Swap 
{
    public static void main(String x[]) 
    {
        int a = Integer.parseInt(x[0]); 
        int b = Integer.parseInt(x[1]); 

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // swapping logic
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}

