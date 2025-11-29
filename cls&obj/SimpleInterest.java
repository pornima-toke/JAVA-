/*5. Calculate Simple Interest
Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time.
Explanation: Demonstrates mathematical formula implementation.
*/
import java.util.*;
class SimpleInterest {
	public double calculate(double principal, double rate, double time){
		return (principal * rate * time) / 100;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);

		System.out.print("Enter Principal amount :");
		double principal = sc.nextDouble();

		System.out.print("Enter Rate of Interest: ");
		double rate = sc.nextDouble();

		System.out.print("Enter Time (in years):");
		double time = sc.nextDouble();

		SimpleInterest si = new SimpleInterest();
		double interest = si.calculate(principal, rate,time);

		System.out.println("Simple Interest = " + interest);
	}
}