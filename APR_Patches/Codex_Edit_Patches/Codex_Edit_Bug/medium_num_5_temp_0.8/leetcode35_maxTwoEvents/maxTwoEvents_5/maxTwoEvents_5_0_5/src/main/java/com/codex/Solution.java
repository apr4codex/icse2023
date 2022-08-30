package com.codex;

import java.util.*;

public class Solution {
    public static int maxTwoEvents(int[][] events) {
        
        int[][] dp = new int[events.length + 1][events.length + 1];
        for (int i = 1; i <= events.length; i++) {
            int min = Integer.MAX_VALUE;
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
            dp[i][1] = events[i-1][2];
            for (int j = 1; j <= events.length; j++) {
                int prevEndTime = (j == 1) ? 0: events[j-2][1];
                if (events[i-1][0] < prevEndTime + 1) {
                    continue;
                } else {
                    if (dp[i-1][j-1] < min)
                        min = dp[i-1][j-1];
                }
                if (dp[i-1][j-1] >= prevEndTime) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1] + events[i-1][2]);
                }
                dp[i][j] = Math.max(dp[i][j], min + events[i-1][2]);
            }
        }
        return Math.max(dp[events.length][events.length], dp[events.length][events.length - 1]);
    }
}