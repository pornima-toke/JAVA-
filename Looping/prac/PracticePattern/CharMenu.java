/* Q3.Write a menu-driven program using switch and do-while to perform operations on a single character:
Check if the character is an alphabet.
If alphabet, check vowel or consonant.
If digit, check even or odd.
Convert uppercase to lowercase or vice versa.
Exit the program */

import java.util.Scanner;

public class CharMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            // Menu display
            System.out.println("\n--- Character Menu ---");
            System.out.println("1. Check if Alphabet");
            System.out.println("2. Check Vowel or Consonant");
            System.out.println("3. If Digit → Check Even/Odd");
            System.out.println("4. Convert Case (Upper ↔ Lower)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Alphabet check
                    System.out.print("Enter a character: ");
                    char ch1 = sc.next().charAt(0);
                    if ((ch1 >= 'A' && ch1 <= 'Z') || (ch1 >= 'a' && ch1 <= 'z'))
                        System.out.println(ch1 + " is an Alphabet.");
                    else
                        System.out.println(ch1 + " is NOT an Alphabet.");
                    break;

                case 2: // Vowel / Consonant check
                    System.out.print("Enter an alphabet: ");
                    char ch2 = sc.next().charAt(0);
                    if ((ch2 >= 'A' && ch2 <= 'Z') || (ch2 >= 'a' && ch2 <= 'z')) {
                        char lower = Character.toLowerCase(ch2);
                        if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u')
                            System.out.println(ch2 + " is a Vowel.");
                        else
                            System.out.println(ch2 + " is a Consonant.");
                    } else {
                        System.out.println("Not a valid Alphabet!");
                    }
                    break;

                case 3: // Digit check (even/odd)
                    System.out.print("Enter a digit (0-9): ");
                    char ch3 = sc.next().charAt(0);
                    if (ch3 >= '0' && ch3 <= '9') {
                        int digit = ch3 - '0';  // Convert char → int
                        if (digit % 2 == 0)
                            System.out.println(ch3 + " is Even.");
                        else
                            System.out.println(ch3 + " is Odd.");
                    } else {
                        System.out.println("Not a Digit!");
                    }
                    break;

                case 4: // Convert case
                    System.out.print("Enter a character: ");
                    char ch4 = sc.next().charAt(0);
                    if (Character.isUpperCase(ch4))
                        System.out.println("Converted: " + Character.toLowerCase(ch4));
                    else if (Character.isLowerCase(ch4))
                        System.out.println("Converted: " + Character.toUpperCase(ch4));
                    else
                        System.out.println("Not an alphabet!");
                    break;

                case 5: // Exit
                    System.out.println("Exiting program... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);
    }
}
