package ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bomb02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixSize = Integer.parseInt(scanner.nextLine());
        String[] command = scanner.nextLine().split(",");

        char[][] matrix = new char[matrixSize][matrixSize];
        int sapperRow = 0;
        int sapperCol = 0;
        int bombCounter = 0;
        for (int row = 0;row < matrixSize;row++){
            List<Character> characterList = Arrays.stream(scanner.nextLine().split(" "))
                    .map(e->e.charAt(0))
                    .collect(Collectors.toList());

            for (int col = 0;col < characterList.size();col++){
                char currentChar = characterList.get(col);
                if(currentChar == 's'){
                    sapperRow = row;
                    sapperCol = col;
                }else if (currentChar == 'B'){
                    bombCounter++;
                }
                matrix[row][col] = currentChar;
            }
        }
        int bombFound = 0;
        for (int i = 0; i < command.length; i++) {
            String commandName = command[i];
            switch (command[i]){
                case "up":
                    if (sapperRow != 0){
                        sapperRow--;
                    }
                    break;
                case "down" :
                    if (sapperRow != matrixSize -1){
                        sapperRow ++;
                    }
                    break;
                case "right" :
                    if (sapperCol != matrixSize -1){
                        sapperCol++;
                    }
                    break;
                case "left" :
                    if (sapperCol != 0){
                        sapperCol--;
                    }
                    break;
            }
            if (matrix[sapperRow][sapperCol] == 'B'){
                System.out.println("You found a bomb!");
                matrix[sapperRow][sapperCol] = '+';
                bombFound++;

                if (bombFound == bombCounter){
                    System.out.println("Congratulations! You found all bombs!");
                    return;
                }

            }else if (matrix[sapperRow][sapperCol] == 'e'){
                System.out.printf("END! %d bombs left on the field%n",bombCounter - bombFound);
                return;
            }
            
        }
        System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)",bombCounter - bombFound,sapperRow,sapperCol);

    }
}
