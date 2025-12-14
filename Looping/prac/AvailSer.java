/*Q44. The chef has to travel to another place. For this, he can avail any one of two cab services.
·        The first cab service charges XX rupees.
·        The second cab service charges YY rupees.
The chef wants to spend the minimum amount of money. Which cab service should the Chef take? */

import java.util.*;
public class AvailSer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int X = sc.nextInt(), Y = sc.nextInt();
            if (X < Y) System.out.println("FIRST");
            else if (Y < X) System.out.println("SECOND");
            else System.out.println("ANY");
        }
    }
}
