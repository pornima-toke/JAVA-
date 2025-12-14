/*Q48. To access CRED programs, one needs to have a credit score of 750750 or more.
Given that the present credit score is XX, determine if one can access CRED programs or not.
If it is possible to access CRED programs, output \text{YES}YES, otherwise output \text{NO}NO.*/

import java.util.Scanner;
public class Q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
        int score = sc.nextInt();

        if (score >= 750) System.out.println("YES");
        else System.out.println("NO");
    }
}

