import java.util.Scanner;

public class NumberComparison {

    // Method to compare two numbers
    public void compare(int a, int b) {
        if (a == b) {
            System.out.println(a + " is equal to " + b);
        } else if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else {
            System.out.println(a + " is less than " + b);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Create object and call method
        NumberComparison obj = new NumberComparison();
        obj.compare(num1, num2);
    }
}
