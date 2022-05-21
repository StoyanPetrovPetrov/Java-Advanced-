package MultidimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        boolean areEqual = compareMatreces(firstMatrix,secondMatrix);

        String output = areEqual ? "equal" : "not equal";
        System.out.println(output);



    }

    private static boolean compareMatreces(int[][] firstMatrix, int[][] secondMatrix) {
        for (int row = 0; row < firstMatrix.length; row++) {
            int[]firstArr = firstMatrix[row];
            int[]secondArr = secondMatrix[row];
            for (int cow = 0; cow < firstArr.length; cow++) {
                int firstElement = firstArr[cow];
                int secondElement = secondArr[cow];

                if (firstElement != secondElement){
                    return false;
                }
                
            }
            
        }
        return true;
    }

    private static int[][] readMatrix(Scanner scanner){
        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cows = Integer.parseInt(dimensions[1]);

        int[][] matrix = new int[rows][cows];
        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer ::parseInt)
                    .toArray();
            matrix[row] = arr;


        }
        return matrix;

    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int[]arr = matrix[row];
            for (int n : arr) {
                System.out.print(n + " ");

            }
            System.out.println();
            
        }
    }
}
