/*Q46. Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5,
 and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). 
 For each successful withdrawal the bank charges 0.50 $US.
Calculate Pooja's account balance after an attempted transaction. */

import java.util.Scanner;
public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
        int X = sc.nextInt();
        double Y = sc.nextDouble();

        if (X % 5 == 0 && X + 0.50 <= Y)
            Y -= (X + 0.50);

        System.out.printf("%.2f\n", Y);
    }
}
