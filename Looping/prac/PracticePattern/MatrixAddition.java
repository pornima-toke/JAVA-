import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 3, cols = 3;
        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        // Input first matrix
        System.out.println("Enter elements of first 3x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second 3x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // Print result
        System.out.println("Resultant Matrix after Addition:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
