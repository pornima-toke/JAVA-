//Q3. Write a java program to print all alphabets from a to z. - using while loop

import java.util.*;
public class Alphabets {
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Character");
		//char ch = sc.next().charAt(0);
		char ch = 'a';
		while( ch <= 'z'){
			System.out.print( ch + " * ");
			ch++;
		}
	}
}