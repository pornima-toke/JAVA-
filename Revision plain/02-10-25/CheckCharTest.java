/*Q3. Write program to create class name as CheckChar with two functions
 void setChar(char ch): this function accept single character as input
 boolean checkChar(): this function can check character is alphabet or digit of special symbol if
character is alphabet or digit return true if character is digit then return false.*/

import java.util.*;

public class CheckCharTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        CheckChar c = new CheckChar();

        System.out.print("Enter any single character: ");
        char ch = sc.next().charAt(0);

        c.setChar(ch);

        boolean result = c.checkChar();

        System.out.println("Result: " + result);
    }
}

class CheckChar {
    private char ch;

    // function to accept single character
    void setChar(char ch) {
        this.ch = ch;
    }

    // function to check type of character
    boolean checkChar() {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("Character is an alphabet.");
            return true;
        } 
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Character is a digit.");
            return false;
        } 
        else {
            System.out.println("Character is a special symbol.");
            return false;
        }
    }
}

