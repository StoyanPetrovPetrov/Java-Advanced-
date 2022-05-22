package MultidimensionalArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer :: parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matix[row] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            
        }
        int maxSum = Integer.MIN_VALUE;

        int[][]result = new int[2][2];
        for (int row = 0; row < rows -1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int currSum = matix[row][col]
                        + matix[row][col + 1]
                        + matix[row + 1][col]
                        + matix[row + 1][col + 1];

                if(maxSum < currSum){
                    maxSum = currSum;
                    result = new int[][]{
                            {matix[row][col] ,matix[row][col + 1] },
                            {matix[row + 1][col] ,matix[row + 1][col + 1] }

                    };
                }
                
            }
            
        }
        printMatrix(result);
        System.out.println(maxSum);



    }

    private static void printMatrix(int[][] matix) {
        for (int r = 0; r < matix.length; r++) {
            for (int c = 0; c < matix[r].length; c++) {
                System.out.print(matix[r][c] + " ");
                
            }
            System.out.println();
            
        }
    }
}
