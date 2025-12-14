//Q24. Write a java program to check whether a character is uppercase or lowercase alphabet.
import java.util.Scanner;

public class CaseCheckDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0); // read first character of user input

        // Check if character is uppercase or lowercase
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an Uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Lowercase letter");
        } else {
            System.out.println(ch + " is not an alphabet character");
        }

        sc.close();
    }
}
