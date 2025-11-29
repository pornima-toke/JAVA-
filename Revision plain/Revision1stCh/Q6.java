//6. Write a program to input numbers and check if the number is duck or not?

import java.util.*;
public class Q6{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number ");
	int n = sc.nextInt();
	
	boolean f = false;
		
	for(int i=0;i<=n;i++){
			
		int a = n % 10;
		if(a==0){
				f = true;
				break;
				}	
	}
	if(f){
		System.out.println("Duck number");
	}
	else{
		System.out.println("Not Duck Number");
	}
	}

}