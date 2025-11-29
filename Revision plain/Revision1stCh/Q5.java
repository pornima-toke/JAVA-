//5. Write a program to input numbers and check if the number is perfect or not?

import java.util.*;

public class Q5{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number");
	int n = sc.nextInt();
	
	int f=1;
	int sum=0;
	for(int i=1;i<=n/2;i++){
		
	if(n%i==0){
		sum = sum +i;
	}
	
	}
	if(sum==n){
		System.out.println("Perfect");
	}
	else{System.out.println("Not Perfect");}
	}
	
}