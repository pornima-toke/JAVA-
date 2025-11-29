/*4. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic.
*/
import java.util.Scanner;
public class NumberChecker {

    // Method to check if a number is even or odd
    public void isEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }
    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Create object and call method
        NumberChecker checker = new NumberChecker();
        checker.isEven(number);
    }
}
