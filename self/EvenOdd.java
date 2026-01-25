/*Check Even or Odd
Write a function isEven(int n) that returns true if the number is even, otherwise false.
Test the function with user input.*/
import java.util.*;

class EvenOddDemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        boolean result = isEven(num);

        if(result)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }

    static boolean isEven(int n)
    {
        if(n % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

