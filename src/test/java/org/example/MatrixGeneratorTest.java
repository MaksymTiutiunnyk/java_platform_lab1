package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixGeneratorTest {

    private int rows;
    private int cols;

    @BeforeEach
    void setUp() {
        rows = 3;
        cols = 3;
    }

    @Test
    void testGenerateMatrixValidSize() {
        short[][] matrix = MatrixGenerator.generateMatrix(rows, cols);
        assertNotNull(matrix);
        assertEquals(rows, matrix.length);
        assertEquals(cols, matrix[0].length);
    }

    @Test
    void testGenerateMatrixInvalidSize() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> MatrixGenerator.generateMatrix(0, cols));
        assertEquals("Matrix dimensions must be greater than zero", exception.getMessage());
    }
}



