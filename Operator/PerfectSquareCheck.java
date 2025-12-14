//import java.util.Scanner;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        double sqrt = Math.sqrt(num);  // Find square root

        String result = (sqrt == (int) sqrt) ? "Perfect Square" : "Not Perfect Square";

        System.out.println("Result: " + result);
    }
}
Q50. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.

