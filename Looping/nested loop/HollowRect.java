import static java.lang.System.out;

public class HollowRect {
    public static void main(String x[]) {
        for (int i = 1; i <= 3; i++) {           // outer loop → rows (1 to 3)
            for (int j = 1; j <= 3; j++) {       // inner loop → columns (1 to 5)
                if (i == 1 || i == 3 || j == 1 || j == 3)
                    System.out.print("* ");      // print star on borders
                else
                    System.out.print("  ");      // print space inside
            }
            System.out.println();               // move to next line after each row
        }
    }
}

/*
   * * * * *
   *       *
   * * * * * 
*/