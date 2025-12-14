/*Q2.Problem Statement:
 Write a menu-driven program using do-while and switch-case to:
Check if a number is prime.
Find the sum of digits of a number.
Reverse a number.
Exit.
Perform operations repeatedly until the user selects exit. */
import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;  // for menu option

        do {
            // Display Menu
            System.out.println("\n--- Number Menu ---");
            System.out.println("1. Check Prime");
            System.out.println("2. Sum of Digits");
            System.out.println("3. Reverse a Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Prime check
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    boolean isPrime = true;
                    if (num <= 1) {
                        isPrime = false;
                    } else {
                        for (int i = 2; i <= num / 2; i++) {
                            if (num % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime)
                        System.out.println(num + " is a Prime Number.");
                    else
                        System.out.println(num + " is NOT a Prime Number.");
                    break;

                case 2: // Sum of digits
                    System.out.print("Enter a number: ");
                    int n1 = sc.nextInt();
                    int sum = 0, temp1 = n1;
                    while (temp1 > 0) {
                        sum += temp1 % 10;
                        temp1 /= 10;
                    }
                    System.out.println("Sum of digits of " + n1 + " = " + sum);
                    break;

                case 3: // Reverse a number
                    System.out.print("Enter a number: ");
                    int n2 = sc.nextInt();
                    int rev = 0, temp2 = n2;
                    while (temp2 > 0) {
                        rev = rev * 10 + temp2 % 10;
                        temp2 /= 10;
                    }
                    System.out.println("Reverse of " + n2 + " = " + rev);
                    break;

                case 4: // Exit
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
    }
}
