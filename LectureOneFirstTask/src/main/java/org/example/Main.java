package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");

        int pStartTree = Integer.parseInt(inputArr[0]);
        int pRange = Integer.parseInt(inputArr[1]);
        int minP = 0;
        int maxP = 0;
        if(pRange != 0) {
            minP = pStartTree  - pRange;
            maxP = pStartTree  + pRange;
        }
        inputArr = scanner.nextLine().split(" ");
        int qStartTree = Integer.parseInt(inputArr[0]);
        int qRange = Integer.parseInt(inputArr[1]);

        int minQ = 0;
        int maxQ = 0;
        if (qRange != 0) {
            minQ = qStartTree  - qRange;
            maxQ = qStartTree  + qRange;
        }

        int zeroTree = 1;
        if (pRange == 0 && qRange == 0) {
            if (pStartTree == qStartTree) {
                System.out.println(zeroTree);
            } else {
                System.out.println(zeroTree*2);
            }
        } else if (pRange == 0) {
            if (pStartTree >= minQ && pStartTree <= maxQ) {
                System.out.println(((maxQ - minQ) + zeroTree));
            } else {
                System.out.println(((maxQ - minQ) + zeroTree*2));
            }
        } else if (qRange == 0) {
            if (qStartTree >= minP && qStartTree <= maxP) {
                System.out.println((zeroTree + maxP - minP));
            } else {
                System.out.println((zeroTree*2 + maxP - minP));
            }
        } else {
            if ((maxP >= minQ && minP <= minQ) || (maxQ >= minP && minQ <= minP)) {
                int max = maxQ > maxP ? maxQ : maxP;
                int min = minQ < minP ? minQ : minP;
                System.out.println(zeroTree + (max - min));
            } else {
                System.out.println((zeroTree + maxP - minP) + ((maxQ - minQ) + zeroTree));
            }
        }
    }
}