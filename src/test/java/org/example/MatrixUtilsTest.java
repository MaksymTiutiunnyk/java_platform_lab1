package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixUtilsTest {

    @Test
    void testPrintMatrixNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> MatrixUtils.printMatrix(null));
        assertEquals("Matrix cannot be null or empty", exception.getMessage());
    }

    @Test
    void testPrintMatrixEmpty() {
        short[][] emptyMatrix = {};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> MatrixUtils.printMatrix(emptyMatrix));
        assertEquals("Matrix cannot be null or empty", exception.getMessage());
    }
}

