//9. Merge Two Arrays

import java.util.*;
public class Array9{
	public static void main(String x[]){
	Scanner  sc = new Scanner(System.in);
	
	System.out.println("Enter the size in Array:");
	int n = sc.nextInt();
	int a[] = new int[n];
	int b[] = new int[n];
	
	
	
	System.out.println("Enter the value in first Array:");
	for(int i=0;i<a.length;i++){
		a[i] = sc.nextInt();
	}
	
	System.out.println("Enter the value in second Array:");
	for(int i=0;i<b.length;i++){
		b[i] = sc.nextInt();
	}
	
	int c[] = new int[a.length + b.length];
	
	
	
	for(int i=0;i<a.length;i++){
		c[i] = a[i];
	}
	for(int i=0;i<b.length;i++){
		c[a.length + i] = b[i];
	}
	System.out.println("Merge two Arrays:");
	for(int i=0;i<c.length;i++){
		System.out.print(c[i]+ " "); 
	}
	
	}
}