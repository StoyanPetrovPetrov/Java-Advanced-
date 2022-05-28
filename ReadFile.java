package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String path = "input.txt";
        try {
            FileInputStream inputStream = new FileInputStream(path);
            int read = inputStream.read();
            while (read != -1){
                System.out.print(Integer.toBinaryString(read) + " ");
                read = inputStream.read();
            }
        }catch (IOException ignored){

        }
    }
}
