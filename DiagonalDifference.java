package MultidimensionalArraysExercises;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][]matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            String[]rowInput = scanner.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(rowInput[col]);

            }

        }
        int maiDiagonalSum = 0;
        for (int counter = 0; counter < size; counter++) {
            maiDiagonalSum += matrix[counter][counter];
            
        }
        int secondDiagonalSum = 0;
        for (int row = 0,col = size - 1; row < size; row++,col --) {
            secondDiagonalSum += matrix[row][col];
            
        }
        int result = Math.abs(maiDiagonalSum - secondDiagonalSum);
        System.out.println(result);
    }
}
