import java.util.Scanner;

public class FibonacciSeries {

    // Function to print Fibonacci series up to n terms
    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        // Special cases
        if (n <= 0) {
            System.out.println("Enter a positive number.");
            return;
        }

        if (n == 1) {
            System.out.print(first);
            return;
        }

        // Print first two terms
        System.out.print(first + " " + second);

        // Loop for remaining terms
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of terms
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        // Function call
        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacci(n);

        sc.close();
    }
}
