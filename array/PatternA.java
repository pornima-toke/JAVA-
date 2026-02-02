/*Q1. Write a java program to print this pattern.
A
# # #
A B C B A
# # # # # # #
A B C D E D C B A
# # # # # # #
A B C B A
# # #
A
*/

import java.util.Scanner;

class PatternA {
    public static void main(String[] args) {

        // Printing fixed pattern using loops
        char ch;
        int i, j;

        // Line 1
        System.out.println("A");

        // Line 2
        for (i = 1; i <= 3; i++) {
            System.out.print("# ");
        }
        System.out.println();

        // Line 3
        ch = 'A';
        for (i = 1; i <= 3; i++) {
            System.out.print(ch + " ");
            ch++;
        }
        ch -= 2;
        for (i = 1; i <= 2; i++) {
            System.out.print(ch + " ");
            ch--;
        }
        System.out.println();

        // Line 4
        for (i = 1; i <= 7; i++) {
            System.out.print("# ");
        }
        System.out.println();

        // Line 5
        ch = 'A';
        for (i = 1; i <= 5; i++) {
            System.out.print(ch + " ");
            ch++;
        }
        ch -= 2;
        for (i = 1; i <= 4; i++) {
            System.out.print(ch + " ");
            ch--;
        }
        System.out.println();

        // Line 6
        for (i = 1; i <= 7; i++) {
            System.out.print("# ");
        }
        System.out.println();

        // Line 7
        ch = 'A';
        for (i = 1; i <= 3; i++) {
            System.out.print(ch + " ");
            ch++;
        }
        ch -= 2;
        for (i = 1; i <= 2; i++) {
            System.out.print(ch + " ");
            ch--;
        }
        System.out.println();

        // Line 8
        for (i = 1; i <= 3; i++) {
            System.out.print("# ");
        }
        System.out.println();

        // Line 9
        System.out.println("A");
    }
}
