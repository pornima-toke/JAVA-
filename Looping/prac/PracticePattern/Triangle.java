import static java.lang.System.out;

public class Triangle {
    public static void main(String x[]) {
        int n = 5;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                int sum = i + j;  // sum of row (i) and column (j)
                
                if (sum % 2 == 0) { // if sum is even
                    out.print("1 ");
                } else {            // if sum is odd
                    out.print("0 ");
                }
            }
            out.println(); // move to next line after each row
        }
    }
}
