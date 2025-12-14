//Q40. Write a java program to input any character and check whether it is alphabet, digit or special character.
import java.util.Scanner;

public class CharacterTypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  // Read first character from input

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit.");
        } else {
            System.out.println(ch + " is a Special Character.");
        }
    }
}
