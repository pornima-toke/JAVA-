import static java.lang.System.out;

public class HollowFullPyramid {
    public static void main(String x[]) {
        for (int i = 1; i <= 6; i++) // Outer loop for rows
        {
            boolean flag = true;
            for (int j = 1; j <= 11; j++) // Inner loop for columns
            {
                if (j >= 7 - i && j <= 5 + i && flag) {
                    // Print star only if it's the first or last star in the row, or if it's the bottom row
                    if (i == 6 || j == 7 - i || j == 5 + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    flag = false;
                } else {
                    System.out.print(" ");
                    flag = true;
                }
            }
            System.out.println();
        }
    }
}
