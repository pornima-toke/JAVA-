Q5. Find Second Max from Every Column
import java.util.*;

public class SecondMaxColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 3, cols = 3;
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter 3x3 matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < cols; j++) {
            int[] col = new int[rows];
            for (int i = 0; i < rows; i++) {
                col[i] = matrix[i][j];
            }
            Arrays.sort(col);
            System.out.println("Second max of column " + (j + 1) + " = " + col[rows - 2]);
        }
        sc.close();
    }
}

Q6. Spiral and Reverse Spiral
public class SpiralMatrix {
    public static void printSpiral(int[][] mat, int n) {
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        StringBuilder spiral = new StringBuilder();
        StringBuilder rev = new StringBuilder();

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) { spiral.append(mat[top][i]).append(" "); rev.insert(0, mat[top][i] + " "); }
            top++;
            for (int i = top; i <= bottom; i++) { spiral.append(mat[i][right]).append(" "); rev.insert(0, mat[i][right] + " "); }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) { spiral.append(mat[bottom][i]).append(" "); rev.insert(0, mat[bottom][i] + " "); }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) { spiral.append(mat[i][left]).append(" "); rev.insert(0, mat[i][left] + " "); }
                left++;
            }
        }
        System.out.println("Spiral: " + spiral);
        System.out.println("Reverse Spiral: " + rev);
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        printSpiral(mat, 3);
    }
}

Q7. Rotate 90° Clockwise
public class RotateMatrix {
    public static void rotate90(int[][] mat, int n) {
        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        // Reverse each row
        for (int i = 0; i < n; i++) {
            int l = 0, r = n - 1;
            while (l < r) {
                int temp = mat[i][l];
                mat[i][l] = mat[i][r];
                mat[i][r] = temp;
                l++; r--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        rotate90(mat, 3);
        System.out.println("Matrix after 90° rotation:");
        for (int[] row : mat) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}

Q8. Max Sum Sub-matrix (Kadane’s 2D)
public class MaxSubMatrixSum {
    public static void main(String[] args) {
        int[][] mat = {
            {1, -2, -1, 4},
            {-8, 3, 4, 2},
            {3, 8, 10, -8},
            {-4, -1, 1, 7}
        };
        int n = mat.length, maxSum = Integer.MIN_VALUE;
        int left=0, right=0, top=0, bottom=0;

        for (int leftCol = 0; leftCol < n; leftCol++) {
            int[] temp = new int[n];
            for (int rightCol = leftCol; rightCol < n; rightCol++) {
                for (int i = 0; i < n; i++) temp[i] += mat[i][rightCol];
                int sum = 0, startRow = 0;
                for (int i = 0; i < n; i++) {
                    sum += temp[i];
                    if (sum > maxSum) {
                        maxSum = sum;
                        left = leftCol; right = rightCol; top = startRow; bottom = i;
                    }
                    if (sum < 0) { sum = 0; startRow = i + 1; }
                }
            }
        }

        System.out.println("Maximum Sum = " + maxSum);
        System.out.println("Coordinates: (" + top + "," + left + ") to (" + bottom + "," + right + ")");
    }
}

Q9. Spiral Traversal but Only Primes
public class SpiralPrime {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }

    static void printSpiralPrimes(int[][] mat, int n) {
        int top=0, bottom=n-1, left=0, right=n-1;
        System.out.print("Prime Spiral: ");
        while (top<=bottom && left<=right) {
            for (int i=left; i<=right; i++) if(isPrime(mat[top][i])) System.out.print(mat[top][i]+" ");
            top++;
            for (int i=top; i<=bottom; i++) if(isPrime(mat[i][right])) System.out.print(mat[i][right]+" ");
            right--;
            if(top<=bottom){
                for (int i=right; i>=left; i--) if(isPrime(mat[bottom][i])) System.out.print(mat[bottom][i]+" ");
                bottom--;
            }
            if(left<=right){
                for (int i=bottom; i>=top; i--) if(isPrime(mat[i][left])) System.out.print(mat[i][left]+" ");
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        printSpiralPrimes(mat, 4);
    }
}

Q10. Row Sum & Column Sum
import java.util.Scanner;

public class RowColSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for n x n matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Row sums
        for (int i=0;i<n;i++) {
            int rowSum=0;
            for (int j=0;j<n;j++) rowSum+=mat[i][j];
            System.out.println("Sum of row " + (i+1) + " = " + rowSum);
        }

        // Column sums
        for (int j=0;j<n;j++) {
            int colSum=0;
            for (int i=0;i<n;i++) colSum+=mat[i][j];
            System.out.println("Sum of col " + (j+1) + " = " + colSum);
        }
        sc.close();
    }
}