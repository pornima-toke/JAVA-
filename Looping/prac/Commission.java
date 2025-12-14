/*  Q6. Calculate commission based on sales amount: 
• Input: Sales amount 
• Logic: 
o Sales < 5000 → 2% commission 
o Sales 5000–10000 → 5% commission 
o Sales > 10000 → 10% commission 
• Output: Display commission amount. */

import java.util.*;
public class Commission
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
        // sales
        System.out.print("Enter sales amount: ");
        double sales = sc.nextDouble();

        double commission;

        //  cal commission
        if (sales < 5000) {
            commission = sales * 0.02;  // 2%
        } else if (sales <= 10000) {
            commission = sales * 0.05;  // 5%
        } else {
            commission = sales * 0.10;  // 10%
        }
        System.out.println("Commission = ₹" + commission);
    }
}
