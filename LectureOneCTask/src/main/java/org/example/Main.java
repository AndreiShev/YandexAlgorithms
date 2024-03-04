package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        int sum = 0;
        HashMap<Integer, Integer> linesValue = new HashMap<>();
        for (int i = 0; i < lines; i++) {
            int tempInput = scanner.nextInt();
            if (linesValue.containsKey(tempInput)) {
                sum += linesValue.get(tempInput);
            } else {
                linesValue.put(tempInput, getCount(tempInput));
                sum += getCount(tempInput);
            }
        }

        System.out.println(sum);
    }

    /*
    Tab - 4
    Space - 1
    */
    public static int getCount(int value) {
        if (value < 4) {
            return value == 3 ? 2 : value;
        }

        return value / 4 + ((value % 4) == 3 ? 2 : (value % 4));
    }
}