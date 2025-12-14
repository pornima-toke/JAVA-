//Q16. Write a Java program to print the ASCII value of a given character.
import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a character from user
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  // Read first character from input

        // Display ASCII value using type casting
        int ascii = (int) ch;

        System.out.println("The ASCII value of '" + ch + "' is: " + ascii);
    }
}
