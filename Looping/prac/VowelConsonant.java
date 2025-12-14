//Q9. Write a java program to input any alphabet and check whether it is vowel or consonant.

import java.util.*;
public class VowelConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("Vowel");
		} else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Consonant");
        } else {
            System.out.println("Not an alphabet");
        }
    }
}

			