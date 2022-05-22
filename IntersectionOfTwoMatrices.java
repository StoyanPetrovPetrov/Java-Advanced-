package MultidimensionalArray;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cows = Integer.parseInt(scanner.nextLine());

        char[][] first = new char[rows][cows];
        for (int row = 0; row < rows; row++) {
            first[row] = scanner.nextLine()
                    .replaceAll("\\s+","")
                    .toCharArray();
            
        }
        char[][] second = new char[rows][cows];
        for (int row = 0; row < rows; row++) {
            second[row] = scanner.nextLine()
                    .replaceAll("\\s+","")
                    .toCharArray();

        }
        char[][] output = new char[rows][cows];
        for (int row = 0; row < rows; row++) {
            for (int cow = 0; cow < cows; cow++) {
                char firstElement = first[row][cow];
                char secondElement = second[row][cow];
                char fillChar = firstElement == secondElement ? firstElement : '*';
                output[row][cow] = fillChar;
                
            }
            
        }
        for (char[] chars : output){
            for (char c : chars){
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }
}
