//Q6. Write a Java program to check whether a character is alphabetic or not.
import java.util.Scanner;

public class AlphabetCheckDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // Read a single character

        // Check if character is alphabetic
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("The character is an alphabet.");
        } else {
            System.out.println("The character is NOT an alphabet.");
        }
    }
}
