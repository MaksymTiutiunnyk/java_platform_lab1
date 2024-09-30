package org.example;

public class MatrixUtils {
    public static void printMatrix(short[][] matrix) {
        if (matrix == null || matrix.length == 0)
            throw new IllegalArgumentException("Matrix cannot be null or empty");

        for (short[] row : matrix) {
            for (short element : row)
                System.out.print(element + "\t");
            System.out.println();
        }
    }
}
