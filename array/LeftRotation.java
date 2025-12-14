//Write a java program create a array with the size of 5 and perform left rotation by 1.

import java.util.*;
public class LeftRotation{
	public static void main (String x[]){
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of Array:");
	int n = sc.nextInt();
	int a[]=new int[5];
	
	System.out.println("Enter the %d value of the Array:");
	for(int i=0;i<a.lenght;i++);
	{a[i]=sc.nextInt();
	
	int first = a[0];
	for(int i=0;i<4;i++){
	a[i]=a[i + 1];
	}
	 a[4] = first;
	 
	 System.out.println("Array After the rotation:");
	 
	 for(int i=0;i<5;i++){
	 System.out.println(" "+a[i]);
	 
	 }
	
	}
	}
}