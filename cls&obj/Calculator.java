/* 2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/
public class Calculator {

    // method for addition
    public int add(int a, int b) {
        return a + b;
    }

    // method for subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // method for multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // method for division
    public int divide(int a, int b) {
        return a / b; // assumes b ≠ 0
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int num1 = 20;
        int num2 = 10;

        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));
    }
}
