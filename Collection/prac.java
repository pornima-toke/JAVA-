import java.util.*;
public class prac
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");

		int num = sc.nextInt();		
		int temp = num;
		int count = 0;
		int sum = 0;
		
		
		while(num !=0)
		{
			count++;
			num = num / 10;
		}
		
		num = temp;
		
		while(num != 0)
		{
			int rem = num % 10;
			int p = 1;
			for(int i = 1; i <= count; i++)
			{
				p = p * rem;
			}
			num = num / 10;
			sum = sum + p;
		}
		if (sum == temp)
		{
            System.out.println(num + " is an Armstrong number");
		}
        else
		{
            System.out.println(num + " is not an Armstrong number");
        } 
    }
}