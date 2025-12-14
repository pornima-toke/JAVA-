/*Q47. Ezio can manipulate at most XX number of guards with the apple of Eden.
Given that there are a YY number of guards, predict if he can safely manipulate all of them.*/

import java.util.Scanner;
public class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int X = sc.nextInt(), Y = sc.nextInt();
            if (X >= Y) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

