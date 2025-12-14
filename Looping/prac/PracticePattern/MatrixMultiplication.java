//Q4. WAP to create two matrix of 3 x 3 and perform matrix multiple on two matrix and store its result in 3rd matrix

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 3, cols = 3;
        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] product = new int[rows][cols];

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

        // Matrix multiplication logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                product[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Print result
        System.out.println("Resultant Matrix after Multiplication:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
