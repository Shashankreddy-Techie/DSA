public class MatrixMultiplication {
    public static void main(String[] args) {
        // Define two matrices
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };
        
        // Call the method to multiply the matrices
        int[][] result = multiplyMatrices(matrixA, matrixB);
        
        // Print the result
        printMatrix(result);
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        // Get the dimensions of the matrices
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        // Check if multiplication is possible
        if (colsA != rowsB) {
            throw new IllegalArgumentException("Number of columns in A must be equal to number of rows in B");
        }

        // Create the result matrix
        int[][] result = new int[rowsA][colsB];

        // Perform multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
