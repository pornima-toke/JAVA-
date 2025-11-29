//2. Find the Smallest Element in an Array

import java.util.*;
public class Array2
{

	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the size in Array:");
	int n = sc.nextInt();
	int a[] = new int[n];
	
	System.out.println("Enter the value in Array:");
	for(int i=0;i<a.length;i++)
	{
		a[i] = sc.nextInt();
	}
	int min = a[0];
	for(int i=0;i<a.length;i++)
	{
	if(a[i]<min)
	{
		min = a[i];
	}
	}
	System.out.println("Smallest Element is:" +min);
	}
}

