//Q39. Write a java program to input any alphabet and check whether it is vowel or consonant.
import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);  // Read a single character

        // Convert to lowercase to simplify comparison
        ch = Character.toLowerCase(ch);

        if ((ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet character.");
        }
    }
}
