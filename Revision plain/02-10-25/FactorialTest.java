/*Q2. Write program to create class name as Factorial with two functions
 void setValue(int x): this function accept number as parameter
 int getFactorial(): this function can calculate the factorial of a number and return it.*/
 
import java.util.*;
public class FactorialTest 
{
    public static void main(String x[])
	{
        Scanner sc = new Scanner(System.in);
        Factorial f = new Factorial();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        f.setValue(n);  // set the input number
        int result = f.getFactorial();  // get factorial

        System.out.println("Factorial of " + n + " is: " + result);
    }
}


class  Factorial
{
    private int num;
	void setValue(int x) 
	{
	num = x;
	}

    // Function to calculate factorial
    int getFactorial()
	{
        int fact = 1;
        for (int i = 1; i <= num; i++) 
		{
            fact *= i;
        }
        return fact;
    }
}

