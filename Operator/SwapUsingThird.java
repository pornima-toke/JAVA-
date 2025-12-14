//Q14. Write a java program swap two number using third variable.
import java.util.Scanner;

public class SwapUsingThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        // Display before swapping
        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // Swapping using third variable
        int temp = a;
        a = b;
        b = temp;

        // Display after swapping
        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}
