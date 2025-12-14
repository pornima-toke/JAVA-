//Q9. Write a java program to input any alphabet and check whether it is vowel or consonant.
import java.util.Scanner;

public class VowelOrConsonantDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a character
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        // Check if it is an alphabet
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            // Convert to lowercase for easy comparison
            ch = Character.toLowerCase(ch);

            // Check for vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The character is a vowel.");
            } else {
                System.out.println("The character is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Not an alphabet.");
        }
    }
}
