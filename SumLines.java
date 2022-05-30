package StreamsFilesDirectoriesExercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumLines {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt"))) {
            String line = bufferedReader.readLine();
            while (line != null){
                long sum = 0;
                char[] characterFromLine = line.toCharArray();
                for (char singelCharacter :characterFromLine) {
                    sum += singelCharacter;
                    
                }
                System.out.println(sum);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
