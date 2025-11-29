/*Q2. Write program to create class name as Factorial with two functions
 void setValue(int x): this function accept number as parameter
 int getFactorial(): this function can calculate the factorial of a number and return it.*/
 
 import java.util.*;
class Factorial{

int a;

	void setValue(int x){
		a = x;
	}

	int getFactorial(){
		int f=1;
		for(int i=1;i<=a;i++){
			f = f*i;
			
		}
		return f;
	}
}

public class FindFactorial{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	Factorial f1 = new Factorial();
	
	System.out.println("Enter the number");
	int n = sc.nextInt();
	
	f1.setValue(n);
	int res = f1.getFactorial();
	
	System.out.println("Factorial is:"+res);
	}
}