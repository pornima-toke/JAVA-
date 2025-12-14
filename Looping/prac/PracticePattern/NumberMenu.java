/* Q4. Write a menu-driven program using switch and do-while to perform operations on a single number:
Count the number of digits
Count how many digits are even
Find the product of all odd digits
Check if the number is an Armstrong number
Exit the program */
import java.util.Scanner;

public class NumberMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        do {
            System.out.println("\n--- Number Menu ---");
            System.out.println("1. Count number of digits");
            System.out.println("2. Count even digits");
            System.out.println("3. Product of odd digits");
            System.out.println("4. Check Armstrong number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Count digits
                    int temp1 = num, count = 0;
                    if (temp1 == 0) count = 1; // Special case for 0
                    while (temp1 != 0) {
                        count++;
                        temp1 /= 10;
                    }
                    System.out.println("Number of digits = " + count);
                    break;

                case 2: // Count even digits
                    int temp2 = num, evenCount = 0;
                    while (temp2 != 0) {
                        int d = temp2 % 10;
                        if (d % 2 == 0) evenCount++;
                        temp2 /= 10;
                    }
                    System.out.println("Even digits count = " + evenCount);
                    break;

                case 3: // Product of odd digits
                    int temp3 = num, product = 1;
                    boolean hasOdd = false;
                    while (temp3 != 0) {
                        int d = temp3 % 10;
                        if (d % 2 != 0) {
                            product *= d;
                            hasOdd = true;
                        }
                        temp3 /= 10;
                    }
                    if (hasOdd)
                        System.out.println("Product of odd digits = " + product);
                    else
                        System.out.println("No odd digits found!");
                    break;

                case 4: // Armstrong check
                    int temp4 = num, sum = 0, digits = 0;

                    // Find number of digits
                    int t = temp4;
                    while (t != 0) {
                        digits++;
                        t /= 10;
                    }

                    t = temp4;
                    while (t != 0) {
                        int d = t % 10;
                        sum += Math.pow(d, digits);
                        t /= 10;
                    }

                    if (sum == num)
                        System.out.println(num + " is an Armstrong number.");
                    else
                        System.out.println(num + " is NOT an Armstrong number.");
                    break;

                case 5: // Exit
                    System.out.println("Exiting program... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);
    }
}
