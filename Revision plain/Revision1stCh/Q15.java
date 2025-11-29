//15. Write program to create array of size 5 and reverse it

import java.util.*;
public class Q15{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of Array:");
	int n = sc.nextInt();
	
	int a[] = new int [n];
	
	System.out.println("Enter the value in Array:");
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	
	System.out.println("Reverse Array:");
	for(int i=n-1;i>=0;i--){
		System.out.println(a[i]);
	}
	}
}
