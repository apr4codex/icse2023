package com.codex;

import java.util.*;

public class Solution {

    /*
    时间复杂度：2^n

    */
    public static int maxTwoEvents(int[][] events) {
        

        if (events == null || events.length == 0 || events[0] == null || events[0].length == 0) {
            return 0;
        }

        int n = events.length;

        for (int i = 0; i < n; i++) {
            dp[i][i] = events[i][2];
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int res = dp[0][i];
            for (int j = i+1; j < n; j++) {
                dp[i+1][j] = Math.max(dp[i][j-1], dp[i+1][j-1]);

                if (events[j][0] >= events[i][1] + 1) {
                    dp[i+1][j] = Math.max(dp[i+1][j], dp[i][i] + events[j][2]);
                }
                res = Math.max(res, dp[i+1][j]);
            }
            max = Math.max(max, res);
        }

        return max;
    }

    
}