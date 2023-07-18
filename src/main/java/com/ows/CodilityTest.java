package com.ows;

import java.util.HashSet;
import java.util.Set;

public class CodilityTest {
    public static int countPlayersToMove(String S) {
        int numSuccessfulMoves = 0;
        int N = S.length();
        Set<Integer> occupiedFields = new HashSet<>();

        for (int i = 0; i < N; i++) {
            char currentMove = S.charAt(i);
            int targetField = -1;

            switch (currentMove) {
                case '<':
                    targetField = i - 1;
                    while (targetField >= 0 && occupiedFields.contains(targetField)) {
                        targetField--;
                    }
                    break;
                case '>':
                    targetField = i + 1;
                    while (targetField < N && occupiedFields.contains(targetField)) {
                        targetField++;
                    }
                    break;
                case '^':
                    targetField = i - 1;
                    while (targetField >= 0 && occupiedFields.contains(targetField)) {
                        targetField--;
                    }
                    break;
                case 'v':
                    targetField = i + 1;
                    while (targetField < N && occupiedFields.contains(targetField)) {
                        targetField++;
                    }
                    break;
                default:
                    break;
            }

            if (targetField >= 0 && targetField < N && !occupiedFields.contains(targetField)) {
                occupiedFields.add(targetField);
                numSuccessfulMoves++;
            }
        }

        return numSuccessfulMoves;
    }
    public static int potHoleSolution(String L1, String L2) {
        int n = L1.length();
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        for (int i = 0; i < n; i++) {
            if (L1.charAt(i) == 'x') {
                dp1[i] = 1;
            }
            if (L2.charAt(i) == 'x') {
                dp2[i] = 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                dp1[i] += dp1[i - 1];
                dp2[i] += dp2[i - 1];
            }
            ans = Math.max(ans, Math.max(dp1[i], dp2[i]));
            if (i > 0) {
                ans = Math.max(ans, dp1[i - 1] + dp2[i]);
                ans = Math.max(ans, dp1[i] + dp2[i - 1]);
            }
        }
        return ans;
    }
}
