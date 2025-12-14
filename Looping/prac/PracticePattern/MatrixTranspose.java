//Q3.WAP to create matrix of 3 x 3 and transpose it means convert row to column and column to row
import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 3, cols = 3;
        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows];

        // Input matrix
        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Transpose logic (swap rows with columns)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display transpose matrix
        System.out.println("Transpose of the Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
