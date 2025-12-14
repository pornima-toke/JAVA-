//Q7. Write a Java program to input cost price and selling price of a product and check profit or loss.
import java.util.Scanner;

public class ProfitLossCheckDic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input cost price and selling price
        System.out.print("Enter cost price: ");
        double costPrice = sc.nextDouble();

        System.out.print("Enter selling price: ");
        double sellingPrice = sc.nextDouble();

        // Decision-making logic
        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("Profit = " + profit);
        } else if (sellingPrice < costPrice) {
            double loss = costPrice - sellingPrice;
            System.out.println("Loss = " + loss);
        } else {
            System.out.println("No profit, no loss.");
        }
    }
}
