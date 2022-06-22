package ExamPreparation;

import java.util.Scanner;

public class Bee02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsAndCols = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[rowsAndCols][rowsAndCols];
        for (int i = 0; i < rowsAndCols; i++) {
            char[] array = scanner.nextLine().toCharArray();
            matrix[i] = array;

        }
        int beeRow = 0;
        int beeCol = 0;

        for (int i = 0; i < rowsAndCols; i++) {
            for (int j = 0; j < rowsAndCols; j++) {
                char currentPosition = matrix[i][j];
                if (currentPosition == 'B') {
                    beeRow = i;
                    beeCol = j;
                }

            }

        }
        boolean isOut = false;
        int flowerCount = 0;

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            switch (command) {
                case "up":
                    matrix[beeRow][beeCol] = '.';
                    if (beeRow - 1 == -1) {
                        isOut = true;
                        break;
                    } else {
                        beeRow--;
                        if (matrix[beeRow][beeCol] == 'f') {
                            matrix[beeRow][beeCol] = 'B';
                            flowerCount++;

                        } else if (matrix[beeRow][beeCol] == 'O') {
                            matrix[beeRow][beeCol] = '.';
                            if (beeRow - 1 == -1) {
                                isOut = true;
                                break;
                            } else {
                                beeRow--;
                                if (matrix[beeRow][beeCol] == 'f') {
                                    flowerCount++;
                                }
                                matrix[beeRow][beeCol] = 'B';
                            }
                        }else if (matrix[beeRow][beeCol] == '.'){
                            matrix[beeRow][beeCol] = 'B';
                        }

                    }
                    break;
                case "down":
                    matrix[beeRow][beeCol] = '.';
                    if (beeRow + 1 == rowsAndCols) {
                        isOut = true;
                        break;
                    } else {
                        beeRow++;
                        if (matrix[beeRow][beeCol] == 'f') {
                            matrix[beeRow][beeCol] = 'B';
                            flowerCount++;
                        } else if (matrix[beeRow][beeCol] == 'O') {
                            matrix[beeRow][beeCol] = '.';
                            if (beeRow + 1 == rowsAndCols) {
                                isOut = true;
                                break;
                            } else {
                                beeRow++;
                                if (matrix[beeRow][beeCol] == 'f') {
                                    flowerCount++;
                                }
                                matrix[beeRow][beeCol] = 'B';
                            }

                        } else if (matrix[beeRow][beeCol] == '.') {
                            matrix[beeRow][beeCol] = 'B';
                        }
                    }
                    break;
                case "left":
                    matrix[beeRow][beeCol] = '.';
                    if (beeCol - 1 == -1) {
                        isOut = true;
                        break;
                    } else {
                        beeCol--;
                        if (matrix[beeRow][beeCol] == 'f') {
                            matrix[beeRow][beeCol] = 'B';
                            flowerCount++;
                        } else if (matrix[beeRow][beeCol] == 'O') {
                            matrix[beeRow][beeCol] = '.';
                            if (beeCol - 1 == -1) {
                                isOut = true;
                                break;
                            } else {
                                beeCol--;
                                if (matrix[beeRow][beeCol] == 'f') {
                                    flowerCount++;
                                }
                                matrix[beeRow][beeCol] = 'B';
                            }

                        } else if (matrix[beeRow][beeCol] == '.') {
                            matrix[beeRow][beeCol] = 'B';
                        }
                    }
                    break;
                case "right":
                    matrix[beeRow][beeCol] = '.';
                    if (beeCol + 1 == rowsAndCols) {
                        isOut = true;
                        break;
                    } else {
                        beeCol++;
                        if (matrix[beeRow][beeCol] == 'f') {
                            matrix[beeRow][beeCol] = 'B';
                            flowerCount++;
                        } else if (matrix[beeRow][beeCol] == 'O') {
                            matrix[beeRow][beeCol] = '.';
                            if (beeCol + 1 == rowsAndCols) {
                                isOut = true;
                                break;
                            } else {
                                beeCol++;
                                if (matrix[beeRow][beeCol] == 'f') {
                                    flowerCount++;
                                }
                                matrix[beeRow][beeCol] = 'B';
                            }

                        } else if (matrix[beeRow][beeCol] == '.') {
                            matrix[beeRow][beeCol] = 'B';
                        }
                    }
                    break;

            }
            if (isOut) {
                break;
            }
            command = scanner.nextLine();
        }

        if (isOut) {
            System.out.println("The bee got lost!");
        }

        if (flowerCount < 5) {
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n", 5 - flowerCount);
        } else {
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", flowerCount);
        }

        for (int i = 0; i < rowsAndCols; i++) {
            for (int j = 0; j < rowsAndCols; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
            }

        }
    }

