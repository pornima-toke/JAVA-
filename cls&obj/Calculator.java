/*2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/

// Class declaration
class Calculator {

    // Method to add two numbers
    int add(int a, int b)
	{
        return a + b;
    }
	//Method to subtract
	int subtract(int a, int b)
	{
		return a - b;
	}
	//Method to multiply
	int multiply(int a, int b)
	{
		return a * b;
	}
	//method to divide
	double divide( int a, int b)
	{
        return (double)a / b;   // type casting for decimal output
	}
	
	
	//Main method - program starts here
	public static void main(String x[])
	{
	// creating object of calculator class
	Calculator calc = new Calculator();
        // Calling methods
        int a = 20, b = 5;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
    }
}
