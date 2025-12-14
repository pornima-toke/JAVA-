import java.util.Scanner;
import java.util.Arrays;

public class MatrixColumnSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 3, cols = 3;
        int[][] matrix = new int[rows][cols];

        // Input matrix
        System.out.println("Enter elements of 3x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Sort each column
        for (int j = 0; j < cols; j++) {
            int[] temp = new int[rows];

            // Extract column into temp array
            for (int i = 0; i < rows; i++) {
                temp[i] = matrix[i][j];
            }

            // Sort the column
            Arrays.sort(temp);

            // Put back sorted values into matrix
            for (int i = 0; i < rows; i++) {
                matrix[i][j] = temp[i];
            }
        }

        // Display sorted matrix
        System.out.println("Matrix after sorting each column:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
