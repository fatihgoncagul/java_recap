package hackerrank;

public class aaa {

    int max(int a, int b) {
        return a > b ? a : b;
    }

    int flippingMatrix(int matrix_rows, int matrix_columns, int[][] matrix) {
        // Calculate the effective size of the upper-left quadrant
        int n = matrix_rows / 2;

        int maxSum = 0;
        // Iterate over the upper-left quadrant of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Determine the elements in the current quadrant
                int a = matrix[i][j];
                int b = matrix[i][matrix_columns - 1 - j];
                int c = matrix[matrix_rows - 1 - i][j];
                int d = matrix[matrix_rows - 1 - i][matrix_columns - 1 - j];

                // Find the maximum element in the current quadrant
                int maxInQuadrant = max(max(a, b), max(c, d));

                // Update the maximum sum
                maxSum += maxInQuadrant;
            }
        }
        return maxSum;
    }


}
