//Q7. Write a Java program to input cost price and selling price of a product and check profit or loss.

import java.util.*;
public class ProfitLoss {
	public static void main(String[] arge) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number");
		int costPrice = sc.nextInt();
		int sellingPrice = sc.nextInt();
        if (sellingPrice > costPrice) {
            System.out.println("Profit of " + (sellingPrice - costPrice));
        } else if (costPrice > sellingPrice) {
            System.out.println("Loss of " + (costPrice - sellingPrice));
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}
