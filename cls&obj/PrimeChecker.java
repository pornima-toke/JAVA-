/*14. Check for Prime Numbers
Create a class PrimeChecker with a method isPrime to check if a number is prime.
Explanation: Introduces number theory logic.
*/
import java.util.*;
class PrimeChecker {
	public boolean isPrime(int number) {
	if (number <= 1) {
	return false;
	}
	for (int i = 2; i <= number / 2; i++){
	if (number % i == 0) {
	return false;
	}
  }
  return true;
 }
 public static void main(String [] args){
 Scanner sc = new Scanner(System.in);

 System.out.print("Enter a number");
 int num = sc.nextInt();

 PrimeChecker pc = new PrimeChecker();
 if (pc.isPrime(num)){
 	System.out.println(num + "is aPrime number.");
 } else {
 	 	System.out.println(num + "is NOT a Prime number.");

 }
 }
}