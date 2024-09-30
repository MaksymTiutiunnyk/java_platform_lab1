package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixOperationsTest {

    private short[][] matrix1;
    private short[][] matrix2;

    @BeforeEach
    void setUp() {
        matrix1 = new short[][]{{1, 2}, {3, 4}};
        matrix2 = new short[][]{{4, 3}, {2, 1}};
    }

    @Test
    void testCalculateXORValidMatrices() {
        short[][] result = MatrixOperations.calculateXOR(matrix1, matrix2);
        short[][] expected = {{5, 1}, {1, 5}};
        assertArrayEquals(expected, result);
    }

    @Test
    void testCalculateXORInvalidDimensions() {
        short[][] invalidMatrix = {{1, 2}};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> MatrixOperations.calculateXOR(matrix1, invalidMatrix));
        assertEquals("Matrices must have the same dimensions", exception.getMessage());
    }

    @Test
    void testSumOfMinElementsValidMatrix() {
        short[][] matrix = {{4, 1, 7}, {5, 2, 6}, {8, 3, 9}};
        int sum = MatrixOperations.sumOfMinElements(matrix);
        assertEquals(6, sum); // 1 + 2 + 3
    }

    @Test
    void testSumOfMinElementsEmptyMatrix() {
        short[][] emptyMatrix = {};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> MatrixOperations.sumOfMinElements(emptyMatrix));
        assertEquals("Matrix cannot be null or empty", exception.getMessage());
    }
}

