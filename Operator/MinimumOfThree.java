//Q46. Write a java program to find a minimum between three numbers. 
import java.util.Scanner;

public class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter first number: ");
        int a = sc.nextInt();  // Read first number

        System.out.print("Enter second number: ");
        int b = sc.nextInt();  // Read second number

        System.out.print("Enter third number: ");
        int c = sc.nextInt();  // Read third number

        if (a <= b && a <= c) {
            System.out.println("Minimum is: " + a);
        } else if (b <= a && b <= c) {
            System.out.println("Minimum is: " + b);
        } else {
            System.out.println("Minimum is: " + c);
        }
    }
}
