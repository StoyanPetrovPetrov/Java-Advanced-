package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = new Scanner(System.in).nextLine();

        ArrayDeque<Integer> indexOfOpenBracket = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                indexOfOpenBracket.push(i);
            } else if (expression.charAt(i) == ')') {
                System.out.println(expression.substring(indexOfOpenBracket.pop(), i + 1));
            }
        }
    }
    }

