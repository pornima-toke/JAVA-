//Q10. Write a java program to input any character and check whether it is alphabet, digit or special character.
import java.util.Scanner;

public class CharacterCheckDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a character
        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0);

        // Check character type
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("It is an Alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("It is a Digit.");
        } else {
            System.out.println("It is a Special Character.");
        }
    }
}
