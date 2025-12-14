/*Q29. Write a java program to input electricity unit charges & calculate total electricity bill according to the given condition
                	For first 50 units Rs. 0.50/unit
                	For next 100 units Rs. 0.75/unit
                	For next 150 units Rs. 1.20/unit
                	For unit above 250 Rs. 1.50/unit
 An additional surcharge of 20% is added to the bill.
*/
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input total units consumed
        System.out.print("Enter electricity units consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        // Calculate bill based on slabs
        if (units <= 50) {
            bill = units * 0.50;
        } else if (units <= 150) {
            bill = 50 * 0.50 + (units - 50) * 0.75;
        } else if (units <= 250) {
            bill = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
        } else {
            bill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
        }

        // Add 20% surcharge
        double surcharge = bill * 0.20;
        double totalBill = bill + surcharge;

        // Display the total bill
        System.out.printf("Electricity Bill = ₹%.2f\n", totalBill);

        sc.close();
    }
}
