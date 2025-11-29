//4. Write a program to input numbers and print its table?

import java.util.*;

public class Q4{
	
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter the number");
	int n = sc.nextInt();
	
	for(int i=1;i<=10;i++){
	
	int table = i*n;
	
	System.out.println(table);
	}
	}
}