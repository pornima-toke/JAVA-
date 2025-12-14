/*Q1. Problem Statement:
 Write a menu-driven program using do-while and switch-case to perform operations on  a bank account balance (initial balance entered by user):
Deposit money.
Withdraw money (only if sufficient balance).
Check current balance.
Exit.
Program should repeatedly allow operations until exit.
*/

import java.util.Scanner;

public class BankMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial balance
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        int choice;  // for menu option
        // Menu loop
        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Deposit
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposited: " + deposit);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 2: // Withdraw
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn: " + withdraw);
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;

                case 3: // Check Balance
                    System.out.println("Current Balance: " + balance);
                    break;

                case 4: // Exit
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);  // keep looping until Exit
    }
}
