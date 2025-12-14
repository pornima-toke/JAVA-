//Q37. Write a Java program to input cost price and selling price of a product and check profit or loss.
import java.util.Scanner;

public class ProfitLossCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter Cost Price: ");
        double costPrice = sc.nextDouble();   // Input cost price

        System.out.print("Enter Selling Price: ");
        double sellingPrice = sc.nextDouble();  // Input selling price

        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("Profit = " + profit);
        } else if (sellingPrice < costPrice) {
            double loss = costPrice - sellingPrice;
            System.out.println("Loss = " + loss);
        } else {
            System.out.println("No Profit No Loss.");
        }
    }
}
