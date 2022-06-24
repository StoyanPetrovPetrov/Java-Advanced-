package exam2020;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lootbox01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> firstBox = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> secondBox = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(secondBox::push);

        int collection = 0;

        while (!(secondBox.isEmpty() || firstBox.isEmpty())) {

            int fromSecond = secondBox.pop();

            int total = firstBox.peek() + fromSecond;

            if (total % 2 == 0) {
                firstBox.poll();
                collection += total;
            } else {
                firstBox.offer(fromSecond);
            }
        }

        String result = " lootbox is empty";
        if (firstBox.isEmpty()) {
            System.out.println("First" + result);
        }
        if (secondBox.isEmpty()) {
            System.out.println("Second" + result);
        }

        String kind;
        if (collection >= 100) {
            kind = "epic!";
        } else {
            kind = "poor...";
        }
        System.out.println("Your loot was " + kind + " Value: " + collection);

}
    }
