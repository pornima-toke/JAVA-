/* Q5.Write a menu-driven program using switch and do-while to perform:
Enter product price and quantity, calculate total bill
Apply discount (10% if bill > ₹1000)
Calculate GST on bill amount (18%)
Compare final bill amount with a given value
Exit the program */
import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = 0, totalBill = 0, finalBill = 0;
        int qty = 0, choice;

        do {
            System.out.println("\n--- Billing Menu ---");
            System.out.println("1. Enter Product Price & Quantity, Calculate Total Bill");
            System.out.println("2. Apply Discount (10% if bill > ₹1000)");
            System.out.println("3. Calculate GST on Bill (18%)");
            System.out.println("4. Compare Final Bill with Given Value");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product Price: ");
                    price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    qty = sc.nextInt();
                    totalBill = price * qty;
                    finalBill = totalBill;
                    System.out.println("Total Bill (before discount/GST) = ₹" + totalBill);
                    break;

                case 2:
                    if (totalBill > 1000) {
                        double discount = totalBill * 0.10;
                        finalBill = totalBill - discount;
                        System.out.println("Discount Applied: ₹" + discount);
                        System.out.println("Bill after Discount = ₹" + finalBill);
                    } else {
                        System.out.println("No discount! Bill is ₹" + totalBill);
                        finalBill = totalBill;
                    }
                    break;

                case 3:
                    double gst = finalBill * 0.18;
                    finalBill += gst;
                    System.out.println("GST Added: ₹" + gst);
                    System.out.println("Final Bill (with GST) = ₹" + finalBill);
                    break;

                case 4:
                    System.out.print("Enter value to compare with final bill: ");
                    double value = sc.nextDouble();
                    if (finalBill > value)
                        System.out.println("Final Bill ₹" + finalBill + " is GREATER than " + value);
                    else if (finalBill < value)
                        System.out.println("Final Bill ₹" + finalBill + " is LESS than " + value);
                    else
                        System.out.println("Final Bill ₹" + finalBill + " is EQUAL to " + value);
                    break;

                case 5:
                    System.out.println("Exiting program... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);
    }
}
