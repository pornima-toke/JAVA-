import java.util.*;
public class Arrprac
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter five values in array");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Display array before sorting");
		for(int i = 0; i < a.length; i++)
		{
			System.out.printf("%d\t",a[i]);
		}
		//apply sorting logics
		for(int i = 0; i < a.length; i++)
		{
			for(int j =(i+1); j < a.length; j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("\ndisplay array after sorting");
		for(int i = 0; i < a.length; i++)
		{
			System.out.printf("%d\t", a[i]);
		}
	}
}