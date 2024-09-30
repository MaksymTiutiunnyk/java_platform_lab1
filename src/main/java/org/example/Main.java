package org.example;

// 23 варіант C5 = 3, C7 = 2, C11 = 1

public class Main {
    public static void main(String[] args) {
        try {
            int rows = 5;
            int cols = 5;

            // Генерація матриць A та B
            short[][] A = MatrixGenerator.generateMatrix(rows, cols);
            short[][] B = MatrixGenerator.generateMatrix(rows, cols);

            // Обчислення матриці C
            short[][] C = MatrixOperations.calculateXOR(A, B);

            // Виведення матриць
            System.out.println("Matrix A:");
            MatrixUtils.printMatrix(A);
            System.out.println("\nMatrix B:");
            MatrixUtils.printMatrix(B);
            System.out.println("\nMatrix C:");
            MatrixUtils.printMatrix(C);

            // Обчислення суми найменших елементів кожного рядка матриці
            int sumOfMinElements = MatrixOperations.sumOfMinElements(C);
            System.out.println("\nSum of the smallest elements in each row: " + sumOfMinElements);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        }
    }
}