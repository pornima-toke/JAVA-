//1.Write a C program to print all natural numbers from 1 to n. - using while loop
/*
import java.util.*;
public class Example 
{  
    public static void main(String x[]) { 
	Scanner xyz  = new Scanner(System.in);
       int no,tab,i;
	   System.out.println("Enter number");
	   no=xyz.nextInt();
	   i=1;
	   while(i<=10)
	   {       tab=no*i;
     System.out.printf("%d X %d = %d\n",i,no,tab);
		   i++;
	   }
   
   }
} */

import java.util.Scanner;
public class NaturalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt(), i = 1;

        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }
    }
}
