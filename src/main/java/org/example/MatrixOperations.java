package org.example;

public class MatrixOperations {
    public static short[][] calculateXOR(short[][] matrix1, short[][] matrix2) {
        if (matrix1 == null || matrix2 == null)
            throw new IllegalArgumentException("Matrices cannot be null");
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length)
            throw new IllegalArgumentException("Matrices must have the same dimensions");

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        short[][] result = new short[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                result[i][j] = (short) (matrix1[i][j] ^ matrix2[i][j]);
        }
        return result;
    }

    public static int sumOfMinElements(short[][] matrix) {
        if (matrix == null || matrix.length == 0)
            throw new IllegalArgumentException("Matrix cannot be null or empty");

        int sum = 0;
        for (short[] row : matrix) {
            short min = row[0];
            for (short element : row) {
                if (element < min)
                    min = element;
            }
            sum += min;
        }
        return sum;
    }
}

