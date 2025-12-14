/*Q49. There is a group of NN friends who wish to enroll in a course together. The course has a maximum capacity
of MM students that can register for it. If there are KK other students who have already enrolled in the course, determine if it will still be possible for all the NN friends to do so or not.
*/

import java.util.Scanner;
public class Q49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(), M = sc.nextInt(), K = sc.nextInt();
            if (N + K <= M) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
