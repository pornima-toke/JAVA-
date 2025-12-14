/*Q52: Create a Java program to simulate a simple calculator using a switch case. It should take two numbers and an
operator (+, -, *, /, %) as input and perform the corresponding operation.
Explanation:
 Use a switch on the operator to handle different arithmetic operations. Add default to handle invalid operators.*/
 
 import java.util.*;
 public class Q52 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number");
		 
		 
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 char op = sc.next().charAt(0);
		 switch (op) {
			 case '+':
			 System.out.println("sum" + (a + b)); break;
            case '-': System.out.println("Difference: " + (a - b)); break;
            case '*': System.out.println("Product: " + (a * b)); break;
            case '/':
                if (b != 0) System.out.println("Quotient: " + (a / b));
                else System.out.println("Division by zero!");
                break;
            case '%':
                if (b != 0) System.out.println("Remainder: " + (a % b));
                else System.out.println("Modulus by zero!");
                break;
            default: System.out.println("Invalid Operator");
        }
    }
}
