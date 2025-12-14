//Q2. Write a java program to print 1 to nth Strong number.
 
import java.util.*;
public class StrongNumber {
    public static void main(String x []) {
      Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int count = 0, num = 1;

        while (count < n) { //conditions
            int sum = 0;
            int i = 1;
            while (i <= num / 2) {
                if (num % i == 0) {
                    sum += i;
                }
                i++;
            }
            if (sum == num) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
