//3. Calculate the Sum and Average of Elements

import java.util.*;
public class Array3{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the size of Array:");
	int n = sc.nextInt();
	
	int a[] = new int[n];
	
	System.out.println("Enter rhe value in Array:");
	for(int  i=0;i<a.length;i++){
		a[i] = sc.nextInt();
	}
	int sum = 0 ;
double	avg=0;
	for(int i=0;i<a.length;i++){
	
	sum = sum + a[i];
	
	}
	System.out.println("Sum is:" +sum);
	
	avg = (double)sum/a.length;
	System.out.println("Average is:"+avg);
	}
}
