import java.util.*;

public class SpiralMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Step 1: Read N
        int N = sc.nextInt();

        // Step 2: Read matrix
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Step 3: Spiral traversal
        int top = 0, bottom = N - 1, left = 0, right = N - 1;

        while (top <= bottom && left <= right) {
            // Move left to right
            for (int j = left; j <= right; j++) {
                System.out.print(matrix[top][j] + " ");
            }
            top++;

            // Move top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Move right to left (if still valid row)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(matrix[bottom][j] + " ");
                }
                bottom--;
            }

            // Move bottom to top (if still valid column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
        sc.close();
    }
}


/*
QUESTION:

Spiral Matrix Traversal

Given an N x N matrix, print its elements in spiral order 
starting from the top-left corner.

Input Format:
- First line: N (size of the matrix)
- Next N lines: N integers each (matrix values)

Output Format:
- The elements of the matrix in spiral order, space-separated.

Example Input:
3
1 2 3
4 5 6
7 8 9

Example Output:
1 2 3 6 9 8 7 4 5
*/
