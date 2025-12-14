import static java.lang.System.out;
public class InvertedFullPyramid {
    public static void main(String x[]) {
        for (int i = 1; i <= 6; i++)  // Outer loop for rows
        {
            boolean flag = true;
            for (int j = 1; j <= 11; j++)  // Inner loop for columns
            {
                if (j >= i && j <= 12 - i && flag) {
                    System.out.printf("*");
                    flag = false;
                } else {
                    System.out.printf(" ");
                    flag = true;
                }
            }
            System.out.printf("\n");
        }
    }
}
