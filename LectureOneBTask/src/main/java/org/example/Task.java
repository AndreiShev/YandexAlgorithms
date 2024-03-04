package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Task {

    public Task() {}

    public int count(String firstGameStr, String secondGameStr, int gameHome) {
        Scanner scanner = new Scanner(System.in);
        String[] firstGameInput = firstGameStr.split(":");
        String[] secondGameInput = secondGameStr.split(":");
        int firstGameHome = gameHome;
        scanner = null;
        int [] firstTeamScore = new int[2];
        firstTeamScore[0] = Integer.parseInt(firstGameInput[0]);
        firstTeamScore[1] = Integer.parseInt(secondGameInput[0]);
        int firstTeamSum = firstTeamScore[0] + firstTeamScore[1];
        int firstMax = firstTeamScore[0]>firstTeamScore[1] ? firstTeamScore[0] : firstTeamScore[1];

        int [] secondTeamScore = new int[2];
        secondTeamScore[0] = Integer.parseInt(firstGameInput[1]);
        secondTeamScore[1] = Integer.parseInt(secondGameInput[1]);
        int secondTeamSum = secondTeamScore[0]+secondTeamScore[1];
        int secondMax = secondTeamScore[0]>secondTeamScore[1] ? secondTeamScore[0] : secondTeamScore[1];

        int result=0;
        switch (firstGameHome) {
            case 1:
                result = secondTeamSum - firstTeamSum;
                result = result < 0 ? 0 : result;
                firstTeamScore[1]+=result;
                if (!(secondTeamSum - firstTeamSum < 0) && (secondMax == 0 && result == 0 || !moreAwayGoals(firstTeamScore, secondTeamScore, firstGameHome))) {
                    result++;
                }

                System.out.println(result);
                break;

            case 2:
                result = secondTeamSum - firstTeamSum;
                result = result < 0 ? 0 : result;
                firstTeamScore[1]+=result;
                int newSum = firstTeamScore[0] + firstTeamScore[1];
                if ((newSum - secondTeamSum == 0 && !moreAwayGoals(firstTeamScore, secondTeamScore, firstGameHome))) {
                    result++;
                }/* else if (result == 0 && !moreAwayGoals(firstTeamScore, secondTeamScore, firstGameHome)) {
                    result = 1;
                }*/ /*else {
                    result = 0;
                }*/
                System.out.println(result);
                break;
        }
        return result;
    }

    public boolean moreAwayGoals(int [] firstTeamScore, int [] secondTeamScore, int firstGameHome) {
        if (firstGameHome == 1) {
            return firstTeamScore[1] > secondTeamScore[0];
        } else {
            return firstTeamScore[0] > secondTeamScore[1];
        }
    }
}
