package exam2020;

import java.util.Arrays;
import java.util.Scanner;

public class ReVolt02 {
    private static int rowMatrix = 0;
    private static int playerRow = -1;
    private static int playerCol = -1;
    private static String command = null;
    private static char[][] matrix = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        rowMatrix = Integer.parseInt(scanner.nextLine());
        int countCommand = Integer.parseInt(scanner.nextLine());
        boolean isFinished = false;

        fillMatrix(scanner);

        while (countCommand --> 0){
            int oldRow = playerRow;
            int oldCol = playerCol;
            command = scanner.nextLine();
            move();
            if (matrix[playerRow][playerCol] == 'B'){
                move();
            }
            if (matrix[playerRow][playerCol] == 'T'){
                playerRow = oldRow;
                playerCol = oldCol;
            }
            if (matrix[playerRow][playerCol] == 'F'){
                isFinished = true;
                break;
            }

        }
        matrix[playerRow][playerCol] = 'f';
        String player;
        if (isFinished){
            player = "won";
        }else {
            player = "lost";
        }
        System.out.println("Player " + player +"!");

        Arrays.stream(matrix).map(String::valueOf).forEach(System.out::println);


    }

    private static void move() {
        switch (command){
            case "up":
                if (SantaInTheMatrix(-1, 0, rowMatrix)) {
                    playerRow--;
                } else {
                    playerRow = rowMatrix - 1;
                }
                break;
            case "down":
                if (SantaInTheMatrix(1, 0, rowMatrix)) {
                    playerRow++;
                } else {
                    playerRow = 0;
                }
                break;
            case "left":
                if (SantaInTheMatrix(0, -1, rowMatrix)) {
                    playerCol--;
                } else {
                    playerCol = rowMatrix - 1;
                }
                break;
            case "right":
                if (SantaInTheMatrix(0, 1, rowMatrix)) {
                    playerCol++;
                } else {
                    playerCol = 0;
                }
                break;

        }
    }

    private static void fillMatrix(Scanner scanner) {
        matrix = new char[rowMatrix][rowMatrix];
        for (int i = 0; i < rowMatrix; i++) {
            String input = scanner.nextLine();
            matrix[i] = input.toCharArray();
            if (input.contains("f")){
                playerRow = i;
                playerCol = input.indexOf("f");
                matrix[playerRow][playerCol] = '-';
            }

        }
    }
    public static boolean SantaInTheMatrix(int rowMutator, int colMutator, int rowMatrix) {
        return playerRow + rowMutator >= 0 && playerRow + rowMutator < rowMatrix && playerCol + colMutator >= 0 && playerCol + colMutator < rowMatrix;
    }
}
