package MultidimensionalArrayLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PositionsOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matrix = readMatrix(scanner);
        int number = Integer.parseInt(scanner.nextLine());
        ArrayList<String> outputLines = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == number){
                    outputLines.add(row + " " + col);
                }
                
            }
            
        }
        if (outputLines.isEmpty()){
            System.out.println("not found");
        }else {
            for (String outputLine:outputLines) {
                System.out.println(outputLine);
                
            }
        }
    }
    public static int[][] readMatrix(Scanner scanner){
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




}

