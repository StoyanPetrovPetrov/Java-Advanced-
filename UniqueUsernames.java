package SetsMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfUserNames = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> usernames = new LinkedHashSet<>();


        for (int i = 0; i < numberOfUserNames; i++) {

            String input = scanner.nextLine();
            usernames.add(input);


        }
        for (String username:usernames) {
            System.out.println(username);

        }
            


        
    }
}
