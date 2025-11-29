//10. Write a program to create an array of size 5 and display its value?

import java.util.*;
public class Q10{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a[]=new int[5];
	
	System.out.println("Enter the values in Array:");
	
	for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	
	}
}
