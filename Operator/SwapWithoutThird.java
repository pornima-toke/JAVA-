//Q15. Write a java program swap two number without using third variable. 
import java.util.Scanner;

public class SwapWithoutThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        // Display before swapping
        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // Swapping without using third variable
        a = a + b;  // Step 1: Add both and store in a
        b = a - b;  // Step 2: Subtract new a - b = original a
        a = a - b;  // Step 3: Subtract new a - new b = original b

        // Display after swapping
        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}
