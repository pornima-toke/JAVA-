//Q24. Write a java program to check whether a character is uppercase or lowercase alphabet.
import java.util.*;
public class CharCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);
		if (ch>= 'A' && ch <= 'Z') {
			System.out.println("Uppercase Alphabet");
		} else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Alphabet");
		} else {
			System.out.println("Not an Alphabet");
		}
	}
}
