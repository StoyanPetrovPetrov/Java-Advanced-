package StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt).toArray();

        int countToPush = input[0];
        int countToPop = input[1];
        int elementsToSearcg = input[2];

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer :: parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < countToPush; i++) {
            stack.push(numbers[i]);
            
        }
        for (int i = 0; i < countToPop; i++) {
            stack.pop();

        }
        if (stack.contains(elementsToSearcg)){
            System.out.println("true");
        }else if (stack.isEmpty()){
            System.out.println("0");
        }else {
            System.out.println(Collections.min(stack));
        }

    }
}
