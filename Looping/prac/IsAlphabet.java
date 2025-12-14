//Q6. Write a Java program to check whether a character is alphabetic or not.

import java.util.Scanner;

public class IsAlphabet {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);
		
        //char ch = new Scanner(System.in).next().charAt(0);
		
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not an Alphabet");
        }
    }
}