//Q27. Write a Java program that takes an alphabet character and toggles its case using ASCII values and operators.
 //       Example: a → A, Z → z.
 import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a single character
        System.out.print("Enter an alphabet character: ");
        char ch = sc.next().charAt(0);

        // Toggle case using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            // Uppercase to lowercase
            ch = (char)(ch + 32);
            System.out.println("Toggled case: " + ch);
        } else if (ch >= 'a' && ch <= 'z') {
            // Lowercase to uppercase
            ch = (char)(ch - 32);
            System.out.println("Toggled case: " + ch);
        } else {
            // Not an alphabet
            System.out.println("Invalid input. Please enter an alphabet (A-Z or a-z).");
        }
    }
}
