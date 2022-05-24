package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrixSize = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer ::parseInt)
                .toArray();
        int rows = matrixSize[0];
        int cols = matrixSize[1];

        int[][]matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[]singleRow = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = singleRow;

        }
        int maxSum = Integer.MIN_VALUE;
        int bestStartRow = -1;
        int bestStartcol = -1;
        for (int row = 0; row < rows -2; row++) {
            for (int col = 0; col < cols -2; col++) {
                int sum = matrix[row][col] + matrix[row][col+1] + matrix[row][col + 2]
                        +matrix[row+1][col] + matrix[row+1][col+1] + matrix[row+1][col + 2]
                        +matrix[row+2][col] + matrix[row+2][col+1] + matrix[row+2][col + 2];
                if (sum > maxSum){
                    maxSum = sum;
                    bestStartRow = row;
                    bestStartcol = col;
                }

            }
        }
        System.out.printf("Sum = %d%n",maxSum);
        for (int row = bestStartRow; row < bestStartRow + 3; row++) {
            for (int col = bestStartcol; col < bestStartcol + 3; col++) {
                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();
            
        }
    }
}
