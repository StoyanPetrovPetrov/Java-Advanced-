package FunctionalProgrammingExercises;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());
        numbers.removeIf(number ->number % n == 0);
        Collections.reverse(numbers);
        numbers.forEach(number -> System.out.print(number + " "));
    }
}
