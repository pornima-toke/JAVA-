/*Q42. Mobile plan billing system:
Input: Minutes used in a month
Logic:
Up to 100 mins → Base ₹199
101–300 mins → ₹199 + ₹1/min for extra
301–500 mins → ₹199 + ₹1.5/min for extra
Above 500 mins → ₹199 + ₹2/min for extra
Output: Total monthly bill.*/

import java.util.*;
public class MoblieBILL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int mins = sc.nextInt();
		double bill = 199;
	 if (mins > 500) bill += (mins - 500) * 2 + 200 * 1.5 + 200 * 1;
     else if (mins > 300) bill += (mins - 300) * 1.5 + 200 * 1;
     else if (mins > 100) bill += (mins - 100) * 1;		 
        System.out.println("Monthly Bill: ₹" + bill);
    }
}
