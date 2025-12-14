import static java.lang.System.out;

public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 5; // size of the butterfly

        // Upper half
        for (int i = 1; i <= n; i++) {
            // Left wing stars
            for (int j = 1; j <= i; j++) {
                out.print("*");
            }

            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                out.print(" ");
            }

            // Right wing stars
            for (int j = 1; j <= i; j++) {
                out.print("*");
            }
            out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {
            // Left wing stars
            for (int j = 1; j <= i; j++) {
                out.print("*");
            }

            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                out.print(" ");
            }

            // Right wing stars
            for (int j = 1; j <= i; j++) {
                out.print("*");
            }
            out.println();
        }
    }
}
