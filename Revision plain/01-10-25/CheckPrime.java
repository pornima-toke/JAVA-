//9. Write a program to check if a number is prime or not?
 /*import java.util.*;
 /*import java.util.*;
public class CheckPrime
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt(), count = 0;
		for(int i=2; i<=n/2; i++)
		{
			if (n % i== 0);
				count++;
			if(n > 1 && count == 0);
			System.out.println("Prime:");
		}
		else
		{			
			System.out.println("Not Prime:");
		}
    }
}

*/
import java.util.*;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;

        if (n <= 1) {
            System.out.println("Not Prime");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                    break;   // no need to check further
                }
            }

            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}
