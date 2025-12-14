/*Q55. Write a program to input a character and check whether it is a vowel or consonant using a switch case.
Explanation:
 Switch on the lowercase character. Use cases for 'a', 'e', 'i', 'o', 'u'; default for consonant.*/
 
 import java.util.*;
 public class Q55 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the Character");
      char ch = Character.toLowerCase(sc.next().charAt(0));
   
       switch (ch) {
		   case 'a' : case 'e' : case 'i' : case 'o' : case 'u' :
		    System.out.println("Vowel");
		  default:
                if (Character.isLetter(ch))
                    System.out.println("Consonant");
                else
                    System.out.println("Not an alphabet");
        }
    }
}