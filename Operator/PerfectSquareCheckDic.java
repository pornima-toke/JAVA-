//Q20. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.
import java.util.Scanner;

public class PerfectSquareCheckDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Calculate square root and check if it is a whole number
        double sqrt = Math.sqrt(num);

        // Ternary operator to check if it's a perfect square
        String result = (sqrt == (int)sqrt) ? "Perfect Square" : "Not Perfect Square";

        // Print the result
        System.out.println("Result: " + result);

        sc.close();
    }
}
