/*Q1. Write a program to create class name as Cube with two methods
void setValue(int x): this function accept number as parameter
int getCube(): this function can calculate a cube of a number and return it.*/

import java.util.*;
class Cube{
	int a;
	 void setValue(int x){
	a=x;
	}
	
	int getCube(){
	
		int cube = a*a*a;
		return cube;
	}
		
}

public class FindCube{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	Cube c1 = new Cube();
	
	System.out.println("Enter the number");
	int n = sc.nextInt();
	
	c1.setValue(n);
	int res = c1.getCube();
	
	System.out.println("cube is:"+res);
	
	}
}