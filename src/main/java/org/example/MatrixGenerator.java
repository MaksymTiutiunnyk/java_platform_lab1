package org.example;

import java.util.Random;

public class MatrixGenerator {
    public static short[][] generateMatrix(int rows, int cols) {
        if (rows <= 0 || cols <= 0)
            throw new IllegalArgumentException("Matrix dimensions must be greater than zero");

        short[][] matrix = new short[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j)
                matrix[i][j] = (short) rand.nextInt(100);
        }
        return matrix;
    }
}

